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
    private int numeroCuenta;
//    private Cliente cliente;

    public int validarTipocuenta(int saldo, String moneda){
        if (moneda == "PESO" && saldo <= 1000000){
            return saldo;
        }
        if (moneda == "DOLAR" && saldo <= 300){
            return saldo;
        }
        if (moneda == "EURO" && saldo <= 150){
            return saldo;
        }
        return 0;
    }
}
