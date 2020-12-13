package com.madeira.pacientekafkaconsumidor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madeira.pacientekafkaconsumidor.domain.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Integer> {

}
