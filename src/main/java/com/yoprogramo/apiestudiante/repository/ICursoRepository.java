package com.yoprogramo.apiestudiante.repository;

import com.yoprogramo.apiestudiante.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepository extends JpaRepository<Curso, Long> {
}
