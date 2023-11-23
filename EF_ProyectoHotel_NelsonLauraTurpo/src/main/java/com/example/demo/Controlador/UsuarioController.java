package com.example.demo.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.Servicios.UsuarioService;
import com.example.demo.modelo.Usuario;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
  @Autowired
  private UsuarioService usuarioService;
  
  @GetMapping
  public List<Usuario> listar() {
    return UsuarioService.listar();
  }

  @PostMapping
  public Usuario crear(@RequestBody Usuario usuario) {
    return UsuarioService.crear(usuario);
  }
}
