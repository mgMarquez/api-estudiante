package com.yoprogramo.apiestudiante.service;

import com.yoprogramo.apiestudiante.model.Curso;

import java.util.List;

public interface ICursoService {
    void addCurso(Curso curso);
    Curso getCursoById(Long id);
    List<Curso> getCursos();
    List<Curso> getCursosContengan(String palabra);
}
