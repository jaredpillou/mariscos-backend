/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mariscos.Proyecto_DW_mariscos.Controladores;

/**
 *
 * @author jared
 */
public class HomeController {
    // Redirige cualquier ruta que no sea un archivo (API o estático) al index.html de Angular
    @GetMapping(value = "/{path:[^\\.]*}")
    public String redirect() {
        return "forward:/index.html";
    }
}
