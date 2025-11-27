package com.List.ToDo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.List.ToDo.dto.TarefaDTO;
import com.List.ToDo.entities.Status;
import com.List.ToDo.entities.Tarefa;
import com.List.ToDo.repository.TarefaRepository;

@Service
public class TarefaService {
	
	@Autowired
	TarefaRepository tarefaRepository;
	
	public void criarTarefa(TarefaDTO dto) {
		Tarefa task = new Tarefa(dto.getNome(), dto.getDescricao(), Status.PENDENTE);
		tarefaRepository.save(task);
	}
	
	public void criarTarefa1(TarefaDTO dto) {
		Tarefa task = new Tarefa(dto);
		tarefaRepository.save(task);
	}
	
    public Tarefa buscarTarefaPorId(Long id) {
        return tarefaRepository.findById(id).orElse(null);
    }
    
    public void deletarTarefa(Long id) {
        tarefaRepository.deleteById(id);
    }
    
    public Tarefa atualizarTarefa(Long id, TarefaDTO dto) {

        Tarefa tarefa = tarefaRepository.findById(id).orElse(null);

        if (tarefa == null) {
            return null;
        }
        tarefa.setNome(dto.getNome());
        tarefa.setDescricao(dto.getDescricao());
        tarefa.setStatus(dto.getStatus());
        tarefa.setDtFim(dto.getDtFim());
        return tarefaRepository.save(tarefa);
    }
}
