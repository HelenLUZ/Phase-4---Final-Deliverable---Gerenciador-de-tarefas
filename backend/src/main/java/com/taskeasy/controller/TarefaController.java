
package com.taskeasy.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.taskeasy.entity.Tarefa;
import com.taskeasy.service.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    @Autowired
    private TarefaService service;

    @GetMapping
    public List<Tarefa> listar() { return service.listar(); }

    @PostMapping
    public Tarefa salvar(@RequestBody Tarefa t) { return service.salvar(t); }
}
