package com.pruebatecnica.onnovacion.financiera.aplicacion.servicio.Mapeos;

import com.pruebatecnica.onnovacion.financiera.adaptadores.web.Dto.ClienteDto;
import com.pruebatecnica.onnovacion.financiera.dominio.modelo.Cliente;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;


@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR

)
public interface ClienteDtoMapper {
    ClienteDtoMapper INSTANCE = Mappers.getMapper(ClienteDtoMapper.class);
    Cliente dtoToDominio(ClienteDto cliente);

//    @Mapping(target = "fechaNacimiento", source = "cliente.fechaNacimiento", dateFormat = "yyyy-MM-dd")
    @InheritInverseConfiguration
    ClienteDto dominioToDto(Cliente cliente);
}
