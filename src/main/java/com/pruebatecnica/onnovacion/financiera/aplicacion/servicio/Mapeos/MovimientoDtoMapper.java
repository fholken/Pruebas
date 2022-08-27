package com.pruebatecnica.onnovacion.financiera.aplicacion.servicio.Mapeos;

import com.pruebatecnica.onnovacion.financiera.adaptadores.web.Dto.MovimientoDto;
import com.pruebatecnica.onnovacion.financiera.dominio.modelo.Movimiento;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface MovimientoDtoMapper {
    MovimientoDtoMapper INSTANCE = Mappers.getMapper(MovimientoDtoMapper.class);

    Movimiento dtoToDominio(MovimientoDto movimientoDto);

}
