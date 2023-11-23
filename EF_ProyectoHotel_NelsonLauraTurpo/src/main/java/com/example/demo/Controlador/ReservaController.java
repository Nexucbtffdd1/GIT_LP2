package com.example.demo.Controlador;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Servicios.ReservaService;
import com.example.demo.modelo.Reserva;

@Controller
@RequestMapping("/reservas")
public class ReservaController {
  @Autowired
  private ReservaService reservaService;

  @GetMapping
  public List<Reserva> listar() {
    return reservaService.listar();
  }

  @PostMapping
  public Reserva crear(@RequestBody Reserva reserva) {
    return reservaService.crear(reserva);
  }
}
