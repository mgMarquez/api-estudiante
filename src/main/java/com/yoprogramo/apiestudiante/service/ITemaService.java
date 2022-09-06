package com.yoprogramo.apiestudiante.service;

import com.yoprogramo.apiestudiante.model.Tema;

public interface ITemaService {
    void addTema(Tema tema);
    Tema getTemaById(Long id);
}
