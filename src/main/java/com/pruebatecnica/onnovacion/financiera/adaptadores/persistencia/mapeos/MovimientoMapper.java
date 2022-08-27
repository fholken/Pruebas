package com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.mapeos;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.MovimientoEntity;
import com.pruebatecnica.onnovacion.financiera.dominio.modelo.Movimiento;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR

)
public interface MovimientoMapper {
    MovimientoMapper INSTANCE = Mappers.getMapper(MovimientoMapper.class);

    MovimientoEntity dominioToEntity(Movimiento movimiento);
}
