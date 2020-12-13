package com.madeira.pacientekafkaconsumidor.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.madeira.pacientekafkaconsumidor.dto.PacienteDTO;
import com.madeira.pacientekafkaconsumidor.services.PacienteService;

@Service
public class KafkaConsumer {
	
	@Autowired
	private PacienteService pacienteService;

	@KafkaListener(topics = "Kafka_Example", groupId  = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}

	@KafkaListener(topics = "Kafka_Example_json", groupId = "group_json", containerFactory = "pacientedtoKafkaListenerFactory")
	public void consumeJson(PacienteDTO dto) {
		System.out.println("NOME: " + dto.getNome());
		pacienteService.insert(dto);
		
	}
}
