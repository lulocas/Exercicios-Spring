package com.lulu.sistematarefas.controller;

import com.lulu.sistematarefas.model.Tarefa;
import com.lulu.sistematarefas.repository.TarefaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("tarefas")
public class TarefaController {
    private TarefaRepository tarefaRepository;

    public TarefaController(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    @PostMapping
    public Tarefa salvar(@RequestBody Tarefa tarefa){
        var id = UUID.randomUUID().toString();
        tarefa.setId(id);
        tarefaRepository.save(tarefa);
        System.out.println("Tarefa recebida: " + tarefa);
        return tarefa;
    }

    @GetMapping("/{id}")
    public Tarefa obterPorId(@PathVariable("id") String id){
        return tarefaRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") String id){
        tarefaRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Tarefa tarefa){
        tarefa.setId(id);
        tarefaRepository.save(tarefa);
    }
}
