package com.example.demo.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Repositorio.ReservaRepository;

import com.example.demo.modelo.Reserva;

@Service
public class ReservaServicelpml implements ReservaService{
	
	  @Autowired
	  private ReservaRepository reservaRepository;

	  public List<Reserva> listar() {
	    return reservaRepository.findAll();
	  }

	  public Reserva crear(Reserva reserva) {
	    return reservaRepository.save(reserva);
	  }
	

}
