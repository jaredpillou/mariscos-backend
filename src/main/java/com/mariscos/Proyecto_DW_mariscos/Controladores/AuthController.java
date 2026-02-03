/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mariscos.Proyecto_DW_mariscos.Controladores;

import com.mariscos.Proyecto_DW_mariscos.Entidades.Usuario;
import com.mariscos.Proyecto_DW_mariscos.Repositorios.UsuarioRepositorio;
import java.util.Collections;
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
@CrossOrigin(origins = "*") 
public class AuthController {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;


    @PostMapping("/usuarios/login") 
    public ResponseEntity<?> login(@RequestBody Map<String, String> credenciales) {
        
    
        String user = credenciales.get("nombre");
        String pass = credenciales.get("contrasena");

     
        Usuario usuarioEncontrado = usuarioRepositorio.findByUsernameAndPassword(user, pass);

        if (usuarioEncontrado != null) {
            return ResponseEntity.ok(usuarioEncontrado);
        } else {
            return ResponseEntity.status(401).body(Collections.singletonMap("mensaje", "Credenciales incorrectas"));
        }
    }
}
