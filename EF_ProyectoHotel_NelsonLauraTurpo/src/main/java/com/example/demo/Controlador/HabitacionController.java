package com.example.demo.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Servicios.HabitacionService;
import com.example.demo.modelo.Habitación;

@Controller
@RequestMapping("/habitaciones")
public class HabitacionController {

    @Autowired
    private HabitacionService habitacionService;

    @GetMapping
    public List<Habitación> listar() {
        return habitacionService.listar();
    }

    @PostMapping
    public Habitación crear(@RequestBody Habitación habitacion) {
        return habitacionService.crear(habitacion);
    }
}
