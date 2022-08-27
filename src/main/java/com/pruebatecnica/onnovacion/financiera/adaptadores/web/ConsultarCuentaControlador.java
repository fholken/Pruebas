package com.pruebatecnica.onnovacion.financiera.adaptadores.web;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.mapeos.CuentaMapper;
import com.pruebatecnica.onnovacion.financiera.adaptadores.web.Dto.CuentaDto;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.ConsultarCuentaPuertoEntrada;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.ConsultarCuentaPuertoSalida;
import com.pruebatecnica.onnovacion.financiera.aplicacion.servicio.Mapeos.CuentaDtoMapper;
import com.pruebatecnica.onnovacion.financiera.dominio.modelo.Cuenta;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "financiera")
public class ConsultarCuentaControlador {

    private final ConsultarCuentaPuertoEntrada consultarCuentaPuertoEntrada;

    @GetMapping(
            value = "/cuenta/ConsultarCuenta/{numeroCuenta}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<CuentaDto> consultarCuenta(@PathVariable int numeroCuenta){
        return ResponseEntity.ok(CuentaDtoMapper.INSTANCE.dominioToDto1(consultarCuentaPuertoEntrada.consultarCuenta(numeroCuenta)));
    }
}
