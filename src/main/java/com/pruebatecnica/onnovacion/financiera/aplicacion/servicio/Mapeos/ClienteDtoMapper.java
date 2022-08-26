package com.pruebatecnica.onnovacion.financiera.aplicacion.servicio.Mapeos;

import com.pruebatecnica.onnovacion.financiera.adaptadores.web.ClienteDto;
import com.pruebatecnica.onnovacion.financiera.dominio.modelo.Cliente;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;


@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR

)
public interface ClienteDtoMapper {
    ClienteDtoMapper INSTANCE = Mappers.getMapper(ClienteDtoMapper.class);
    Cliente dtoToDominio(ClienteDto cliente);
}
