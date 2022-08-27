package com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
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

//    @ToString.Exclude
    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<CuentaEntity> cuenta;



}
