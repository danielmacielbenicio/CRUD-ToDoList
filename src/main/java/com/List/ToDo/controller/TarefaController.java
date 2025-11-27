package com.List.ToDo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.List.ToDo.dto.TarefaDTO;
import com.List.ToDo.service.TarefaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("tarefa")
public class TarefaController {

	private final TarefaService tarefaService;
	
	public TarefaController(TarefaService tarefaService) {
		this.tarefaService = tarefaService;
	}
	
	@PostMapping
	public ResponseEntity<?> criarTarefa(@Valid @RequestBody TarefaDTO dto){
		tarefaService.criarTarefa1(dto);
		return ResponseEntity.ok("Tarefa Criada com Sucesso!");
	}
}
