package com.pruebatecnica.onnovacion.financiera.dominio.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Cuenta {

    private Long idCliente;

    private TipoMoneda tipoMoneda;
    private int moneda;
    private BigDecimal saldo;

    public void validarTipoMoneda(){
        if (this.tipoMoneda.equals(TipoMoneda.PESO)){
            this.moneda = 1;
        } else if (this.tipoMoneda.equals(TipoMoneda.DOLAR)) {
            this.moneda = 2;
        } else {
            this.moneda = 3;
        }
    }
}
