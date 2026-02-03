package com.mariscos.Proyecto_DW_mariscos.Repositorios;


import com.mariscos.Proyecto_DW_mariscos.Entidades.Platillo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatilloRepositorio extends JpaRepository<Platillo, Long> {
}
