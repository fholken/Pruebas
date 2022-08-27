package com.pruebatecnica.onnovacion.financiera.aplicacion.puerto;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.ClienteEntity;
import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.CuentaEntity;

public interface CreacionCuentaPuertoSalida {
    void crearCuenta(ClienteEntity cliente, CuentaEntity cuenta);
}
