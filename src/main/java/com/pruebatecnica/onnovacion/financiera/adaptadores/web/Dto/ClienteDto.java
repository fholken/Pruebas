package com.pruebatecnica.onnovacion.financiera.adaptadores.web.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteDto {
    private String tipoCliente;
    private String nombre;
    private String apellido;
    private int numeroDocumento;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento;

    private List<CuentaDto> cuenta;
}
