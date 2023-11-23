package com.example.demo.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositorio.HabitacionRepository;
import com.example.demo.modelo.Habitación;

@Service
public class HabitacionServicelpml implements HabitacionService{
	
	public class HabitacionService {

	  @Autowired
	  private HabitacionRepository habitacionRepository;

	  public List<Habitación> listar() {
	    return habitacionRepository.findAll();
	  }

	  public Habitación crear(Habitación habitacion) {
	    return habitacionRepository.save(habitacion);
	  }
	}

	@Override
	public Habitación crear(Habitación habitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Habitación> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
