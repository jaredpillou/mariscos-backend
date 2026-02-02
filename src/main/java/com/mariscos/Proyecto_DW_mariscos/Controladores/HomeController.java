
package com.mariscos.Proyecto_DW_mariscos.Controladores;

import org.springframework.web.bind.annotation.GetMapping;

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
