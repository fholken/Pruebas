package com.pruebatecnica.onnovacion.financiera.aplicacion.servicio.Mapeos;

import com.pruebatecnica.onnovacion.financiera.adaptadores.web.Dto.CuentaDto;
import com.pruebatecnica.onnovacion.financiera.dominio.modelo.Cuenta;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface CuentaDtoMapper {
    CuentaDtoMapper INSTANCE = Mappers.getMapper(CuentaDtoMapper.class);

    @Mapping(target = "cuentaDto.numeroCuenta", ignore = true)
    @Mapping(target = "cuentaDto.movimiento", ignore = true)
    Cuenta dtoToDominio(CuentaDto cuentaDto);

    CuentaDto dominioToDto1(Cuenta cuenta);
}
