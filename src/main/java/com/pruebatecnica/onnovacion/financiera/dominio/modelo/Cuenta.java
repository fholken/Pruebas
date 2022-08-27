package com.pruebatecnica.onnovacion.financiera.dominio.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Cuenta {
    private Long idCliente;
    private TipoMoneda tipoMoneda;
    private int saldo;
}
