package com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.repositorio;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.ClienteEntity;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.CreacionClientePuertoSalida;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrearClienteAdaptador  implements CreacionClientePuertoSalida {

    private final IClienteRepositorio repositorio;
    @Override
    public void crearCliente(ClienteEntity cliente) {

        repositorio.save(cliente);
    }
}
