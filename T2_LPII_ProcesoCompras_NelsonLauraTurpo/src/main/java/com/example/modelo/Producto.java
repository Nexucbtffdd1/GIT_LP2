package com.example.modelo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
    
	private String nombre;
	private String descripcion;
	private double precio;
	
    @OneToMany(mappedBy = "producto")
    private List<Compra> compras;
	public Producto() {}
	
	@Override
	public String toString() {
		return "Producto [Id=" + Id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", compras=" + compras + "]";
	}
	public Integer getId() {
		return Id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public List<Compra> getCompras() {
		return compras;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	
	 
}