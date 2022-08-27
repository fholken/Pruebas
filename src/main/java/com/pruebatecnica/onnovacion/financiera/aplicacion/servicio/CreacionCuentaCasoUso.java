package com.pruebatecnica.onnovacion.financiera.aplicacion.servicio;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.ClienteEntity;
import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.mapeos.CuentaMapper;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.ConsultarClientePuertoSalida;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.CreacionCuentaPuertoEntrada;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.CreacionCuentaPuertoSalida;
import com.pruebatecnica.onnovacion.financiera.dominio.modelo.Cuenta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CreacionCuentaCasoUso implements CreacionCuentaPuertoEntrada {

    private final CreacionCuentaPuertoSalida creacionCuentaPuertoSalida;
    private final ConsultarClientePuertoSalida consultarClientePuertoSalida;
    @Override
    public void crearCuenta(Cuenta cuenta) {
        ClienteEntity cliente = consultarClientePuertoSalida.consultarCliente(cuenta.getIdCliente());
        creacionCuentaPuertoSalida.crearCuenta(cliente, CuentaMapper.INSTANCE.dominioToEntity(cuenta));
    }
}
