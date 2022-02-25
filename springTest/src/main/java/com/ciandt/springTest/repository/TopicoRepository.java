package com.ciandt.springTest.repository;

import com.ciandt.springTest.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {

    // opção 1
    List<Topico> findByCurso_Nome(String nomeCurso);

    // opção 2
    @Query("SELECT t from TOPICO t WHERE t.curso.nome = :nomeCurso")
    List<Topico> carregarPorNomeCurso(@Param("nbomeCurso") String nomeCurso);

}
