package com.yoprogramo.apiestudiante.controller;

import com.yoprogramo.apiestudiante.dto.CursoDTO;
import com.yoprogramo.apiestudiante.dto.TemaDTO;
import com.yoprogramo.apiestudiante.model.Curso;
import com.yoprogramo.apiestudiante.model.Tema;
import com.yoprogramo.apiestudiante.service.ICursoService;
import com.yoprogramo.apiestudiante.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EstudianteController {
    @Autowired
    private ITemaService temaService;
    @Autowired
    private ICursoService cursoService;


    @PostMapping("/temas/crear")
    public void crearTema(@RequestBody TemaDTO temaDTO) {
        Curso curso = cursoService.getCursoById(temaDTO.getId_curso());
        Tema tema = new Tema();
        tema.setCurso(curso);
        tema.setDescripcion(temaDTO.getDescripcion());
        tema.setNombre(temaDTO.getNombre());
        temaService.addTema(tema);
    }

    @PostMapping("/cursos/crear")
    public void crearTema(@RequestBody Curso curso) {
        cursoService.addCurso(curso);
    }

    @GetMapping("/cursos")
    @ResponseBody
    public List<Curso> obtenerCursos() {
        return cursoService.getCursos();
    }

    @GetMapping("/temas/{id}")
    @ResponseBody
    public List<Tema> obtenerTemasDeUnCurso(@PathVariable Long id) {
        Curso curso = cursoService.getCursoById(id);

        return curso.getListaDeTemas();
    }

    @GetMapping("/cursos/")
    @ResponseBody
    public List<Curso> getCursosContengan(@RequestParam String contiene) {
        return cursoService.getCursosContengan(contiene);
    }

    @PutMapping("/cursos/modificar")
    public void modificarCurso(@RequestBody CursoDTO cursoDTO) {
        Curso curso = cursoService.getCursoById(cursoDTO.getId_curso());
        curso.setTipo_curso(cursoDTO.getTipo_curso());
        curso.setNombre(cursoDTO.getNombre());
        curso.setFecha_finalizacion(cursoDTO.getFecha_finalizacion());
        cursoService.addCurso(curso);
    }

    @PutMapping("/temas/modificar")
    public void modificarTema(@RequestBody TemaDTO temaDTO) {
        Tema tema = temaService.getTemaById(temaDTO.getId_tema());
        tema.setNombre(temaDTO.getNombre());
        tema.setDescripcion(temaDTO.getDescripcion());
        temaService.addTema(tema);
    }
}
