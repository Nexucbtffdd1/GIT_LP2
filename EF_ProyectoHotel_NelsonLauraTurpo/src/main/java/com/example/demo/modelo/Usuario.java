package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    private String nombre;
	    private String email;
	    private String telefono;
	    
	    public Usuario(){}

		public Integer getId() {
			return id;
		}

		public String getNombre() {
			return nombre;
		}

		public String getEmail() {
			return email;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		@Override
		public String toString() {
			return "Usuario [id=" + id + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + "]";
		}


	    
}
