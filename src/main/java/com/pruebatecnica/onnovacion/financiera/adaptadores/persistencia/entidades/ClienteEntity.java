package com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades;

import lombok.Data;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Table(name = "clientes")
@Entity
public class ClienteEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long idCliente;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = true)
    private String apellido;

    @Column(name = "tipo_cliente")
    private String tipoCliente;

    @Column(name="numero_documento", nullable = false)
    private int numeroDocumento;

//    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaNacimiento;

    @OneToMany(mappedBy = "cliente")
    private List<CuentaEntity> cuenta;



}
