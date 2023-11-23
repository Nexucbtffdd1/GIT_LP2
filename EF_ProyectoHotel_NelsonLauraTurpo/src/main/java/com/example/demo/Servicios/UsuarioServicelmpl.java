package com.example.demo.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositorio.UsuarioRepository;
import com.example.demo.modelo.Usuario;

@Service
public class UsuarioServicelmpl implements UsuarioService{
	  @Autowired
	  private UsuarioRepository usuarioRepository;

	  public List<Usuario> listar() {
	    return usuarioRepository.findAll();
	  }

	  public Usuario crear(Usuario usuario) {
	    return usuarioRepository.save(usuario);
	  }
	}


