package com.yoprogramo.apiestudiante.service;

import com.yoprogramo.apiestudiante.model.Tema;
import com.yoprogramo.apiestudiante.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaService implements ITemaService{
    @Autowired
    private ITemaRepository repo;
    @Override
    public void addTema(Tema tema) {
        repo.save(tema);
    }

    @Override
    public Tema getTemaById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
