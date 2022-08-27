package com.pruebatecnica.onnovacion.financiera.aplicacion.puerto;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.ClienteEntity;

public interface ConsultarClientePuertoSalida {

    ClienteEntity consultarCliente(Long id);
}
