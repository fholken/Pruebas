package com.pruebatecnica.onnovacion.financiera.aplicacion.servicio;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.mapeos.CuentaMapper;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.ConsultarCuentaPuertoEntrada;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.ConsultarCuentaPuertoSalida;
import com.pruebatecnica.onnovacion.financiera.dominio.modelo.Cuenta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ConsultarCuentaCasoUso implements ConsultarCuentaPuertoEntrada {

    private final ConsultarCuentaPuertoSalida consultarCuentaPuertoSalida;
    @Override
    public Cuenta consultarCuenta(int numeroCuenta) {
        return CuentaMapper.INSTANCE.entityToDominio(consultarCuentaPuertoSalida.consultarCuenta(numeroCuenta));
    }
}
