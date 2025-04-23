package com.lulu.sistematarefas.repository;

import com.lulu.sistematarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, String> {
}
