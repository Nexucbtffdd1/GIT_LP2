package com.example.demo.Servicios;

import java.util.List;

import com.example.demo.modelo.Reserva;

public interface ReservaService {

	List<Reserva> listar();

	Reserva crear(Reserva reserva);
	
	
	
}
