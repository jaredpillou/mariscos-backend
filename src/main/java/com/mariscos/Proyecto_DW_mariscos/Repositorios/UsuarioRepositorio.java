/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mariscos.Proyecto_DW_mariscos.Repositorios;

import com.mariscos.Proyecto_DW_mariscos.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
    // Método mágico: Spring crea la consulta SQL automáticamente al leer el nombre
    Usuario findByUsernameAndPassword(String username, String password);
    
    // Para verificar si existe antes de crear
    Usuario findByUsername(String username);
}
