package com.pruebatecnica.onnovacion.financiera.aplicacion.servicio;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.mapeos.CuentaMapper;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.CreacionCuentaPuertoEntrada;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.CreacionCuentaPuertoSalida;
import com.pruebatecnica.onnovacion.financiera.dominio.modelo.Cuenta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CreacionCuentaCasoUso implements CreacionCuentaPuertoEntrada {

    private final CreacionCuentaPuertoSalida creacionCuentaPuertoSalida;
    @Override
    public void crearCuenta(Cuenta cuenta) {
        cuenta.validarTipoMoneda();
        creacionCuentaPuertoSalida.crearCuenta(CuentaMapper.INSTANCE.dominioToEntity(cuenta));
    }
}
