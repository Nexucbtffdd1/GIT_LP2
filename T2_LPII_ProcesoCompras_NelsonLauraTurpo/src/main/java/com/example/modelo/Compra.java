package com.example.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
	
@Entity
@Table(name="compra")
public class Compra {
	    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    private int cantidad;
    private double total;

    
    public Compra() {}


	public Integer getId() {
		return id;
	}


	public Producto getProducto() {
		return producto;
	}


	public int getCantidad() {
		return cantidad;
	}


	public double getTotal() {
		return total;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	@Override
	public String toString() {
		return "Compra [id=" + id + ", producto=" + producto + ", cantidad=" + cantidad + ", total=" + total + "]";
	}
    
    
}
