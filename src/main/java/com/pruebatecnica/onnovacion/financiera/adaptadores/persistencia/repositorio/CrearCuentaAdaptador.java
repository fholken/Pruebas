package com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.repositorio;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.ClienteEntity;
import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.CuentaEntity;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.CreacionCuentaPuertoSalida;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrearCuentaAdaptador implements CreacionCuentaPuertoSalida {

    private final ICuentaRepositorio repositorio;
    @Override
    public void crearCuenta(ClienteEntity cliente, CuentaEntity cuenta) {
        cuenta.setCliente(cliente);
        repositorio.save(cuenta);
    }
}
