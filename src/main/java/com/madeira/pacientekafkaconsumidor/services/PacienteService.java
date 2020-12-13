package com.madeira.pacientekafkaconsumidor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madeira.pacientekafkaconsumidor.domain.Paciente;
import com.madeira.pacientekafkaconsumidor.dto.PacienteDTO;
import com.madeira.pacientekafkaconsumidor.repositories.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository repo;
	
	public void insert(PacienteDTO dto) {
		Paciente paciente = new Paciente(null, dto.getNome(),
				dto.getCrmMedico(), dto.getProblema(), dto.getDiagnostico());
		paciente = repo.save(paciente);
	}

}
