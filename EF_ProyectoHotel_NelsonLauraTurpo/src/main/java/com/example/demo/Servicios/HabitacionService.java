package com.example.demo.Servicios;

import java.util.List;

import com.example.demo.modelo.Habitación;

public interface HabitacionService {

	Habitación crear(Habitación habitacion);

	List<Habitación> listar();

}
