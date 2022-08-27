package com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.repositorio;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.ClienteEntity;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.ConsultarClientePuertoSalida;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ConsultarClienteAdaptador implements ConsultarClientePuertoSalida {

    private final IClienteRepositorio repositorio;
    @Override
    public ClienteEntity consultarCliente(Long id) {
        Optional<ClienteEntity> clienteEntity = repositorio.findById(id);
        if (clienteEntity.isPresent())
            return clienteEntity.get();
        return null;
    }
}
