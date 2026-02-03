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

    Usuario findByUsernameAndPassword(String username, String password);
    

    Usuario findByUsername(String username);
}
