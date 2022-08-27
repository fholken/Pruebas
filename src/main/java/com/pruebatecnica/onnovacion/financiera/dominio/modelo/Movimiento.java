package com.pruebatecnica.onnovacion.financiera.dominio.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movimiento {

    private int numeroCuenta;
    private boolean tipoMovimiento;
    private int valorMovimiento;
}
