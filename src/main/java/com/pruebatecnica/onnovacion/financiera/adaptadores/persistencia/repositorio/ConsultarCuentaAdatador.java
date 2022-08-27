package com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.repositorio;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.CuentaEntity;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.ConsultarCuentaPuertoSalida;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ConsultarCuentaAdatador implements ConsultarCuentaPuertoSalida {

    private final ICuentaRepositorio repositorio;
    @Override
    public CuentaEntity consultarCuenta(int numeroCuenta) {
        Optional<CuentaEntity> cuentaEntity = repositorio.findById(numeroCuenta);
        if (cuentaEntity.isPresent())
            return cuentaEntity.get();
        return null;
    }
}
