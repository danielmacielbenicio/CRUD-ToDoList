package com.List.ToDo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.List.ToDo.dto.TarefaDTO;
import com.List.ToDo.entities.Tarefa;
import com.List.ToDo.service.TarefaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("tarefa")
public class TarefaController {

	private final TarefaService tarefaService;
	
	public TarefaController(TarefaService tarefaService) {
		this.tarefaService = tarefaService;
	}
	
	@PostMapping("criar")
	public ResponseEntity<?> criarTarefa(@Valid @RequestBody TarefaDTO dto){
		tarefaService.criarTarefa1(dto);
		return ResponseEntity.ok("Tarefa Criada com Sucesso!");
	}
	@GetMapping("listar/{id}")
	public ResponseEntity<?> buscarPorId(@PathVariable Long id) {
		Tarefa tarefa = tarefaService.buscarTarefaPorId(id);
		
		if (tarefa == null) {
			return ResponseEntity.status(404).body("Tarefa não encontrada");
		}
		
		return ResponseEntity.ok(tarefa);
	}
	
    @PutMapping("atualizar/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody TarefaDTO dto) {
        Tarefa tarefaAtualizada = tarefaService.atualizarTarefa(id, dto);

        if (tarefaAtualizada == null) {
            return ResponseEntity.status(404).body("Tarefa não encontrada");
        }

        return ResponseEntity.ok(tarefaAtualizada);
    }
    
    @DeleteMapping("deletar/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {

        tarefaService.deletarTarefa(id);

        return ResponseEntity.ok("Tarefa deletada com sucesso");
    }
}
