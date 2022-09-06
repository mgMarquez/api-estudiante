package com.yoprogramo.apiestudiante.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tema;
    private String nombre;
    private String descripcion;
    @ManyToOne
    @JsonIgnore
    private Curso curso;
}
