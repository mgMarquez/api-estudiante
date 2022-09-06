package com.yoprogramo.apiestudiante.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter @Setter
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_curso;
    private String nombre;
    private String tipo_curso;
    private String fecha_finalizacion;
    @OneToMany(mappedBy = "curso")
    private List<Tema> listaDeTemas;

}
