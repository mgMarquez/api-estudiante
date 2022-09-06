package com.yoprogramo.apiestudiante.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TemaDTO {
    private Long id_tema;
    private String nombre;
    private String descripcion;
    private Long id_curso;
}
