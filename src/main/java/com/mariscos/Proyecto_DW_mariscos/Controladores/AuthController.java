/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mariscos.Proyecto_DW_mariscos.Controladores;

import com.mariscos.Proyecto_DW_mariscos.Entidades.Usuario;
import com.mariscos.Proyecto_DW_mariscos.Repositorios.UsuarioRepositorio;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Permite peticiones desde cualquier lado
public class AuthController {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    // Endpoint para Login
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> credenciales) {
        String user = credenciales.get("username");
        String pass = credenciales.get("password");

        // Buscamos en la base de datos
        Usuario usuarioEncontrado = usuarioRepositorio.findByUsernameAndPassword(user, pass);

        if (usuarioEncontrado != null) {
            return ResponseEntity.ok().body("{\"mensaje\": \"Login exitoso\"}");
        } else {
            return ResponseEntity.status(401).body("{\"mensaje\": \"Credenciales incorrectas\"}");
        }
    }
}
