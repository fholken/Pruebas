package com.pruebatecnica.onnovacion.financiera.aplicacion.servicio;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.CuentaEntity;
import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.mapeos.MovimientoMapper;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.ConsultarCuentaPuertoSalida;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.GenerarMovimientoPuertoEntrada;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.GenerarMovimientoPuertoSalida;
import com.pruebatecnica.onnovacion.financiera.aplicacion.servicio.Mapeos.MovimientoDtoMapper;
import com.pruebatecnica.onnovacion.financiera.dominio.modelo.Movimiento;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GenerarMovimientoCasoUso implements GenerarMovimientoPuertoEntrada {

    private final GenerarMovimientoPuertoSalida generarMovimientoPuertoSalida;
    private final ConsultarCuentaPuertoSalida consultarCuentaPuertoSalida;

    @Override
    public void generarMovimiento(Movimiento movimiento) {
        CuentaEntity cuenta = consultarCuentaPuertoSalida.consultarCuenta(movimiento.getNumeroCuenta());

        int saldo = cuenta.getSaldo();
        generarMovimientoPuertoSalida.generarMovimiento(cuenta, MovimientoMapper.INSTANCE.dominioToEntity(movimiento));
    }
}
