package com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.mapeos;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.ClienteEntity;
import com.pruebatecnica.onnovacion.financiera.dominio.modelo.Cliente;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR

)
public interface ClienteMapper {
    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

//    @Mapping(target = "tipoCliente", source = "cliente.tipoCliente")
    ClienteEntity dominioToEntity(Cliente cliente);
    Cliente entityToDominio1(ClienteEntity cliente);
}
