package com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.repositorio;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.CuentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICuentaRepositorio extends JpaRepository<CuentaEntity, Integer> {
}
