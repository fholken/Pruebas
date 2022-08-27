package com.pruebatecnica.onnovacion.financiera.adaptadores.web;

import com.pruebatecnica.onnovacion.financiera.adaptadores.web.Dto.ClienteDto;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.ConsultarClientePuertoEntrada;
import com.pruebatecnica.onnovacion.financiera.aplicacion.servicio.Mapeos.ClienteDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "financiera")
public class ConsultarClienteControlador {

    private final ConsultarClientePuertoEntrada consultarClientePuertoEntrada;

    @GetMapping(
            value = "/cliente/ConsultarCliente/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<ClienteDto> consultarCliente(@PathVariable Long id){
        return ResponseEntity.ok(ClienteDtoMapper.INSTANCE.dominioToDto(consultarClientePuertoEntrada.consultarCliente(id)));
    }
}
