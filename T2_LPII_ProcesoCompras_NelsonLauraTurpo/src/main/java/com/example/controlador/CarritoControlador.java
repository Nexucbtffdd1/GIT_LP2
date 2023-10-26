package com.example.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.modelo.Producto;
import com.example.servicio.ProductoServicio;

@Controller
public class CarritoControlador {
	private List<Producto> carrito = new ArrayList<>();

	@Autowired
	private ProductoServicio productoServicio;

	@PostMapping("/agregarproducto")
	public String addToChart(@RequestParam("productoId") Integer productoId) {
		Producto producto = productoServicio.obtenerPorId(productoId);
		carrito.add(producto);

		return "redirect:/catalogo";
	}

	@GetMapping("/carrito")
	public String mostrarCarrito(Model model) {		
		model.addAttribute("productosEnCarrito", carrito);

		double montoTotal = carrito.stream().mapToDouble(Producto::getPrecio).sum();
		model.addAttribute("montoTotal", montoTotal);

		return "carrito";
	}
}