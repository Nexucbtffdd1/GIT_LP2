package com.example.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.modelo.Compra;
import com.example.servicio.CategoriaServicio;

@Controller
public class CompraControlador {

	@Autowired
	private CategoriaServicio compraservicio;

	@GetMapping("/showcarrito")
	public String mostrarCarrito(Model model) {
		model.addAttribute("compras", compraservicio.obtenerTodas());
		return "carrito";
	}

	@GetMapping("/Resultado")
	public String mostrarResumenCompra(Model model) {
		List<Compra> compras = compraservicio.obtenerTodas();

		// Lógica para calcular el total de todas las compras
		double totalCompra = calcularTotalCompra(compras);

		model.addAttribute("compras", compras);
		model.addAttribute("totalCompra", totalCompra);

		return "resumen";
	}

	private double calcularTotalCompra(List<Compra> compras) {
		double total = 0.0;
		for (Compra compra : compras) {
			total += compra.getTotal();
		}
		return total;
	}	
    @PostMapping("/procesarCompra")
    @ResponseBody
    
    public String procesarCompra() {
    	
        System.out.println("La compra ha sido realizada exitosamente.");

        return "La compra ha sido realizada exitosamente.";
    }
    
    @PostMapping("/cancelarCompra")
    @ResponseBody
    public String cancelarCompra() {

        compraservicio.eliminarCompra();

        return "Compra cancelada! . Carrito de compras vacío.";
    }
	}