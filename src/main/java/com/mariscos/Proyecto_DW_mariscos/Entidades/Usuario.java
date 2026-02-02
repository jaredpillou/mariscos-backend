/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mariscos.Proyecto_DW_mariscos.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios_sistema") // <--- CAMBIAMOS EL NOMBRE PARA FORZAR CREACIÓN NUEVA
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true)
    private String username;
    
    private String password;
    
    private String rol; // <--- ¡ESTA ES LA LÍNEA QUE TE FALTABA!

    public Usuario() {}

    public Usuario(String username, String password, String rol) {
        this.username = username;
        this.password = password;
        this.rol = rol; // <--- Faltaba esto
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    public String getRol() { return rol; } // <--- Faltaba esto
    public void setRol(String rol) { this.rol = rol; } // <--- Faltaba esto
}
