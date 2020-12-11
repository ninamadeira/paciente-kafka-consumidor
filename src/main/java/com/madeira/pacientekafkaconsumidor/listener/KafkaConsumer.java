package com.madeira.pacientekafkaconsumidor.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.madeira.pacientekafkaconsumidor.dto.PacienteDTO;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "Kafka_Example", group = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}

	@KafkaListener(topics = "Kafka_Example_json", group = "group_json", containerFactory = "pacientedtoKafkaListenerFactory")
	public void consumeJson(PacienteDTO dto) {
		System.out.println("NOME: " + dto.getNome());
		System.out.println("PROBLEMA:" + dto.getProblema());
		System.out.println("DIAGNÓSTICO: " + dto.getDiagnostico());
		System.out.println("CRM RESPONSÁVEL:" + dto.getCrmMedico());
	}
}
