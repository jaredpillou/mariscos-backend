package com.mariscos.Proyecto_DW_mariscos.Repositorios;

// IMPORTANTE: Esta línea conecta con la carpeta Entidades
import com.mariscos.Proyecto_DW_mariscos.Entidades.Platillo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatilloRepositorio extends JpaRepository<Platillo, Long> {
}
