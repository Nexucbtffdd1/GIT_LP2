package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicamento")
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idmedicamento ;
	private String nombre ;
	private String descripcion ;
	private String categoria ; 
	private double precio ;
	private int stock  ;
	private String 	proveedor  ;
	public Medicamento(int idmedicamento, String nombre, String descripcion, String categoria, double precio, int stock,
			String proveedor) {
		this.idmedicamento = idmedicamento;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
		this.proveedor = proveedor;
	}
	public Medicamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Medicina [idmedicamento=" + idmedicamento + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", categoria=" + categoria + ", precio=" + precio + ", stock=" + stock + ", proveedor=" + proveedor
				+ "]";
	}
	public int getIdmedicamento() {
		return idmedicamento;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public double getPrecio() {
		return precio;
	}
	public int getStock() {
		return stock;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setIdmedicamento(int idmedicamento) {
		this.idmedicamento = idmedicamento;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	
	
	
	
}
