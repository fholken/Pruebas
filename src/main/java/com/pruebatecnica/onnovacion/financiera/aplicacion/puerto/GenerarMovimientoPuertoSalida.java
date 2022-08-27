package com.pruebatecnica.onnovacion.financiera.aplicacion.puerto;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.CuentaEntity;
import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.MovimientoEntity;

public interface GenerarMovimientoPuertoSalida {
    void generarMovimiento(CuentaEntity cuenta, MovimientoEntity movimiento);
}
