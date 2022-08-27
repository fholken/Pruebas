package com.pruebatecnica.onnovacion.financiera.adaptadores.web.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MovimientoDto {
    private int numeroCuenta;
    private boolean tipoMovimiento;
    private int valorMovimiento;
}
