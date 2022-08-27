package com.pruebatecnica.onnovacion.financiera.aplicacion.puerto;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.CuentaEntity;

public interface ConsultarCuentaPuertoSalida {

    CuentaEntity consultarCuenta(int numeroCuenta);
}
