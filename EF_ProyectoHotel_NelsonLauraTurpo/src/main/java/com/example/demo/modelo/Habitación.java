package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "habitaciones")
public class Habitación {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer numero;
    private String tipo;
    private Double precio;
    
    @OneToMany(mappedBy = "habitaciones")
    private List<Reserva> reservas;
    
    public Habitación(){}

	public Integer getId() {
		return id;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public Double getPrecio() {
		return precio;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	@Override
	public String toString() {
		return "Habitación [id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", precio=" + precio + ", reservas="
				+ reservas + "]";
	}

	
    
}
