
package com.taskeasy.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.taskeasy.entity.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {}
