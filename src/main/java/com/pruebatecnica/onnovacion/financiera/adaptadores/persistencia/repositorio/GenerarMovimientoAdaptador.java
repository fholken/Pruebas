package com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.repositorio;

import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.CuentaEntity;
import com.pruebatecnica.onnovacion.financiera.adaptadores.persistencia.entidades.MovimientoEntity;
import com.pruebatecnica.onnovacion.financiera.aplicacion.puerto.GenerarMovimientoPuertoSalida;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;



@AllArgsConstructor
@Service
public class GenerarMovimientoAdaptador implements GenerarMovimientoPuertoSalida {

    private final IMovimientoRepositorio movimientoRepositorio;
    private final ICuentaRepositorio cuentaRepositorio;

    @Override
    public void generarMovimiento(CuentaEntity cuenta, MovimientoEntity movimiento) {
        int saldo;
        if (movimiento.isTipoMovimiento()) {
            saldo = cuenta.getSaldo() + movimiento.getValorMovimiento();
        }else {
            saldo = cuenta.getSaldo() - movimiento.getValorMovimiento();
        }
        validar(cuenta, movimiento, saldo);
    }

    private void validar(CuentaEntity cuenta, MovimientoEntity movimiento, int saldo) {
        switch (cuenta.getTipoMoneda()){
            case "PESO":
                if (saldo <= 1000000){
                    cuenta.setSaldo(saldo);
                    cuentaRepositorio.save(cuenta);
                    movimiento.setCuenta(cuenta);
                    movimientoRepositorio.save(movimiento);
                }
            case "DOLAR":
                if (saldo <= 300 ){
                    cuenta.setSaldo(saldo);
                    cuentaRepositorio.save(cuenta);
                    movimiento.setCuenta(cuenta);
                    movimientoRepositorio.save(movimiento);
                }
            case "EURO":
                if (saldo < 150){
                    cuenta.setSaldo(saldo);
                    cuentaRepositorio.save(cuenta);
                    movimiento.setCuenta(cuenta);
                    movimientoRepositorio.save(movimiento);
                }
            default:
                break;
        }
    }
}
