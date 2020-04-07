package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.uca.capas.domain.Usuario;

@Controller()
public class MainController {

  @GetMapping("/login")
  public String enviarForm(Usuario usuario) {
    return "login";
  }

  // Nombre de usuario : admin , contraseña: root
  @PostMapping("/login")
  public String procesarForm(Usuario usuario) {
    if (!(usuario.getUsuario().equals("admin") && usuario.getContraseña().equals("root"))) {
      return "mostrarMensajeF";
    }
    return "mostrarMensajeV";
  }
}
