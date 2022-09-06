package com.yoprogramo.apiestudiante.service;

import com.yoprogramo.apiestudiante.model.Curso;
import com.yoprogramo.apiestudiante.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService implements ICursoService{
    @Autowired
    ICursoRepository repo;

    @Override
    public void addCurso(Curso curso) {
        repo.save(curso);
    }

    @Override
    public Curso getCursoById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Curso> getCursos() {
        return repo.findAll();
    }

    @Override
    public List<Curso> getCursosContengan(String palabra) {
        return repo.findAll()
                .stream()
                .filter(c -> c.getNombre().toLowerCase()
                        .contains(palabra.toLowerCase()))
                .toList();
    }
}
