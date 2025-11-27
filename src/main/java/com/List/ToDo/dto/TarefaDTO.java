package com.List.ToDo.dto;

import java.time.LocalDate;

import com.List.ToDo.entities.Status;

import jakarta.validation.constraints.NotBlank;

public class TarefaDTO {
	
	private long id;
	@NotBlank
	private String nome;
	@NotBlank
	private String descricao;
	private Status status;
	private LocalDate dtInicio;
	private LocalDate dtFim;
	
	public TarefaDTO() {
		
	}
	
	public TarefaDTO(String nome, String descricao, LocalDate dtInicio,
			LocalDate dtFim) {
		this.nome = nome;
		this.descricao = descricao;
		this.status = Status.PENDENTE;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
	}
	
	public TarefaDTO(long id, String nome, String descricao, Status status, LocalDate dtInicio,
			LocalDate dtFim) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDate getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(LocalDate dtInicio) {
		this.dtInicio = dtInicio;
	}

	public LocalDate getDtFim() {
		return dtFim;
	}

	public void setDtFim(LocalDate dtFim) {
		this.dtFim = dtFim;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
}
