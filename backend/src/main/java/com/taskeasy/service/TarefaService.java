
package com.taskeasy.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.taskeasy.entity.Tarefa;
import com.taskeasy.repository.TarefaRepository;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository repo;

    public List<Tarefa> listar() { return repo.findAll(); }
    public Tarefa salvar(Tarefa t) { return repo.save(t); }
}
