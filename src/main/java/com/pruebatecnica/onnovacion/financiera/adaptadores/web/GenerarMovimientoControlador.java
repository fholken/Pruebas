package com.pruebatecnica.onnovacion.financiera.adaptadores.web;

import com.pruebatecnica.onnovacion.financiera.adaptadores.web.Dto.MovimientoDto;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.GenerarMovimientoPuertoEntrada;
import com.pruebatecnica.onnovacion.financiera.aplicacion.servicio.Mapeos.MovimientoDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "financiera")
public class GenerarMovimientoControlador {
    private final GenerarMovimientoPuertoEntrada generarMovimientoPuertoEntrada;

    @PutMapping(
            value = "/movimiento/generarMovimiento",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> generarMovimiento(@RequestBody MovimientoDto movimientoDto){
        generarMovimientoPuertoEntrada.generarMovimiento(MovimientoDtoMapper.INSTANCE.dtoToDominio(movimientoDto));
        return ResponseEntity.ok().build();
    }
}
