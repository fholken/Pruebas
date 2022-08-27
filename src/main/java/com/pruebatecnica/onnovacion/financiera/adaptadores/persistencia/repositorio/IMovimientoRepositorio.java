package com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.repositorio;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.MovimientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovimientoRepositorio extends JpaRepository<MovimientoEntity, Long> {
}
