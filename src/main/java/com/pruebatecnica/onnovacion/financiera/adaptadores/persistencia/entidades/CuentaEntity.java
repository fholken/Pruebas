package com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Table(name = "cuentas")
@Entity
public class CuentaEntity {

    @Id
    @Column(unique = true)
    private int numeroCuenta;

    private int idTipoMoneda;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private ClienteEntity cliente;

    @Column(nullable = true)
    private BigDecimal saldo;

    @OneToMany(mappedBy = "cuenta")
    private List<MovimientoEntity> movimiento;

}
