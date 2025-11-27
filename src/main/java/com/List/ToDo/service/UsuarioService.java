package com.List.ToDo.service;

import org.springframework.stereotype.Service;

import com.List.ToDo.dto.UsuarioDTO;
import com.List.ToDo.entities.Usuario;
import com.List.ToDo.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	private final UsuarioRepository usuarioRepository;
	
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public UsuarioDTO criarUsuario(UsuarioDTO dto) {
		  Usuario user = new Usuario(dto.getNome(),dto.getEmail(),dto.getSenha());
		  usuarioRepository.save(user);
		  UsuarioDTO udto = new UsuarioDTO(user);
		return udto;
		
	}
	
}