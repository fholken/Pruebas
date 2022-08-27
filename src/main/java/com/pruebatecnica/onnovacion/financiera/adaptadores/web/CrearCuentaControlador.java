package com.pruebatecnica.onnovacion.financiera.adaptadores.web;

import com.pruebatecnica.onnovacion.financiera.adaptadores.web.Dto.CuentaDto;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.CreacionCuentaPuertoEntrada;
import com.pruebatecnica.onnovacion.financiera.aplicacion.servicio.Mapeos.CuentaDtoMapper;
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
public class CrearCuentaControlador {

    private final CreacionCuentaPuertoEntrada creacionCuentaPuertoEntrada;

    @PostMapping(
            value = "/cuenta/crearCuenta",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> crearCuenta(@RequestBody CuentaDto cuentaDto){
        creacionCuentaPuertoEntrada.crearCuenta(CuentaDtoMapper.INSTANCE.dtoToDominio(cuentaDto));
        return ResponseEntity.ok().build();
    }
}
