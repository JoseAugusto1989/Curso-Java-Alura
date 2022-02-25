package com.ciandt.springTest.repository;

import com.ciandt.springTest.model.Curso;
import com.ciandt.springTest.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    Curso findByNome(String nome);
}
