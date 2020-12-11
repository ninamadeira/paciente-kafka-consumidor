package com.madeira.pacientekafkaconsumidor.dto;

public class PacienteDTO {
	private Integer id;

	private String nome;

	private String crmMedico;

	private String problema;

	private String diagnostico;

	public PacienteDTO() {
	}

	public PacienteDTO(Integer id, String nome, String crmMedico, String problema, String diagnostico) {
		this.id = id;
		this.nome = nome;
		this.crmMedico = crmMedico;
		this.problema = problema;
		this.diagnostico = diagnostico;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrmMedico() {
		return crmMedico;
	}

	public void setCrmMedico(String crmMedico) {
		this.crmMedico = crmMedico;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
}