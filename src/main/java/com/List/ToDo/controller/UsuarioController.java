package com.List.ToDo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.List.ToDo.dto.UsuarioDTO;
import com.List.ToDo.service.UsuarioService;

import jakarta.validation.Valid;

public class UsuarioController {
	
	private final UsuarioService usuarioService;
	
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@PostMapping
	public ResponseEntity<?> criarUsuario(@Valid @RequestBody UsuarioDTO dto) {
		return ResponseEntity.ok(usuarioService.criarUsuario(dto));
	}
}
