package com.pruebatecnica.onnovacion.financiera.aplicacion.puerto;

import com.pruebatecnica.onnovacion.financiera.dominio.modelo.Cuenta;

public interface ConsultarCuentaPuertoEntrada {

    Cuenta consultarCuenta(int numeroCuenta);
}
