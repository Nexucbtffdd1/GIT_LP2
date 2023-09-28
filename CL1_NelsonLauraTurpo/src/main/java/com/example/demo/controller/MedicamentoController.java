package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.*;
import com.example.demo.repositorio.*;

@Controller
@RequestMapping("/medicamentos")
public class MedicamentoController {
	@Autowired
	private MedicamentoRepositorio medicamentoReposit; 

	@GetMapping("/")
	public String listarMedicamentos(Model model) {
		List<Medicamento> medicamentos = medicamentoReposit.findAll();
		model.addAttribute("medicamentos", medicamentos);
		return "listarMedicamentos"; 
	}
	
	@GetMapping("/nuevo")
	public String nuevoMedicamento(Model model) {
		model.addAttribute("medicamento", new Medicamento());
		return "nuevoMedicamento"; 
	}
	
	@PostMapping("/guardar")
	public String guardarMedicamento(@ModelAttribute Medicamento medicamento) {
		medicamentoReposit.save(medicamento);
		return "redirect:/medicamentos/"; 
	}
	
	@GetMapping("/editar/{id}")
	public String editarMedicamento(@PathVariable Integer id, Model model) {
		Medicamento medicamento = medicamentoReposit.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("ID de medicamento no válido"));
		model.addAttribute("medicamento", medicamento);
		return "editarMedicamento"; 
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminarMedicamento(@PathVariable Integer id) {
		medicamentoReposit.deleteById(id);
		return "redirect:/medicamentos/";
	}
}
