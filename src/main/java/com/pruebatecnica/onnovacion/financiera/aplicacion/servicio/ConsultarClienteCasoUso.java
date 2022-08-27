package com.pruebatecnica.onnovacion.financiera.aplicacion.servicio;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.mapeos.ClienteMapper;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.ConsultarClientePuertoEntrada;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.ConsultarClientePuertoSalida;
import com.pruebatecnica.onnovacion.financiera.dominio.modelo.Cliente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ConsultarClienteCasoUso implements ConsultarClientePuertoEntrada {

    private final ConsultarClientePuertoSalida consultarClientePuertoSalida;
    @Override
    public Cliente consultarCliente(Long id) {

        return ClienteMapper.INSTANCE.entityToDominio(consultarClientePuertoSalida.consultarCliente(id));
    }
}
