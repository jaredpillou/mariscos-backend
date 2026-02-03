package com.mariscos.Proyecto_DW_mariscos.Controladores;


import com.mariscos.Proyecto_DW_mariscos.Entidades.Platillo;
import com.mariscos.Proyecto_DW_mariscos.Repositorios.PlatilloRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/platillos")
@CrossOrigin(origins = "*") 
public class PlatilloControlador {

    @Autowired
    private PlatilloRepositorio repositorio;

    @GetMapping
    public List<Platillo> obtenerMenu() {
        return repositorio.findAll();
    }

    @PostMapping
    public Platillo guardarPlatillo(@RequestBody Platillo platillo) {
        return repositorio.save(platillo);
    }
    
    @PutMapping("/{id}")
    public Platillo actualizarPrecio(@PathVariable Long id, @RequestBody Platillo platilloDatos) {

        Platillo platilloExistente = repositorio.findById(id).orElse(null);
        
        if (platilloExistente != null) {
            platilloExistente.setPrecio(platilloDatos.getPrecio());
            platilloExistente.setDisponible(platilloDatos.getDisponible());
            return repositorio.save(platilloExistente);
        }
        return null;
    }
    
    @DeleteMapping("/{id}")
    public void eliminarPlatillo(@PathVariable Long id) {
        repositorio.deleteById(id);
    }
    
}