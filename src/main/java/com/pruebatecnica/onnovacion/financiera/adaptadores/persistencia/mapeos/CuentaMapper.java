package com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.mapeos;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.CuentaEntity;
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
public interface CuentaMapper {

    CuentaMapper INSTANCE = Mappers.getMapper(CuentaMapper.class);

    @Mapping(target = "cuenta.numerocuenta", ignore = true)
    CuentaEntity dominioToEntity(Cuenta cuenta);
}
