package com.pruebatecnica.onnovacion.financiera.aplicacion.servicio;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.mapeos.ClienteMapper;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.CreacionClientePuertoEntrada;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.CreacionClientePuertoSalida;
import com.pruebatecnica.onnovacion.financiera.dominio.modelo.Cliente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CreacionClienteCasoUso implements CreacionClientePuertoEntrada {

    private final CreacionClientePuertoSalida creacionClientePuertoSalida;
    @Override
    public void crearCliente(Cliente cliente) {
        cliente.validarTipoCliente();
        creacionClientePuertoSalida.crearCliente(ClienteMapper.INSTANCE.dominioToEntity(cliente));
    }
}
