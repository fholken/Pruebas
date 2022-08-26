package com.pruebatecnica.onnovacion.financiera.dominio.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Cliente {

    private TipoCliente tipoCliente;
    private String nombre;
    private String apellido;
    private int numeroDocumento;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;
    private int tipoDocumento;
    private List<Cuenta> cuentas;

    public void validarTipoCliente(){
        if (this.tipoCliente.equals(TipoCliente.NATURAL)){
            this.tipoDocumento = 1;
        }else {
            this.tipoDocumento = 2;
        }
    }
}
