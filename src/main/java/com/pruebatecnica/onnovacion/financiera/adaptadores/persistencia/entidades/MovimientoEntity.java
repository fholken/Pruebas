package com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Table(name = "movimientos")
@Entity
public class MovimientoEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "numeroCuenta")
    private CuentaEntity cuenta;

    private int valorMovimiento;
    private Date fechaMovimiento;
    private boolean tipoMovimiento;



}
