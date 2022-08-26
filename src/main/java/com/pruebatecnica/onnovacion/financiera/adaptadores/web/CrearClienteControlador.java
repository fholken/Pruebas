package com.pruebatecnica.onnovacion.financiera.adaptadores.web;

import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.CreacionClientePuertoEntrada;
import com.pruebatecnica.onnovacion.financiera.aplicacion.servicio.Mapeos.ClienteDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "financiera")
public class CrearClienteControlador {

    private final CreacionClientePuertoEntrada creacionClientePuertoEntrada;

    @PostMapping(
            value = "/cliente/crearCliente",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> crearCliente(@RequestBody ClienteDto clienteDto){
        creacionClientePuertoEntrada.crearCliente(ClienteDtoMapper.INSTANCE.dtoToDominio(clienteDto));
        return ResponseEntity.ok().build();
    }
}
