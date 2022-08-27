package com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Table(name = "cuentas")
@Entity
public class CuentaEntity {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numeroCuenta;

    private String tipoMoneda;

//    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private ClienteEntity cliente;

    @Column(nullable = true)
    private int saldo;

    @ToString.Exclude
    @OneToMany(mappedBy = "cuenta")
    private List<MovimientoEntity> movimiento;

}
