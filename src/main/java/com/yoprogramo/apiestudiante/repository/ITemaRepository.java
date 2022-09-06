package com.yoprogramo.apiestudiante.repository;

import com.yoprogramo.apiestudiante.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITemaRepository extends JpaRepository<Tema, Long> {
}
