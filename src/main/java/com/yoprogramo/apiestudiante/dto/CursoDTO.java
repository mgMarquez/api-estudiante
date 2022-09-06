package com.yoprogramo.apiestudiante.dto;

import com.yoprogramo.apiestudiante.model.Curso;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CursoDTO {
    private Long id_curso;
    private String nombre;
    private String tipo_curso;
    private String fecha_finalizacion;

}
