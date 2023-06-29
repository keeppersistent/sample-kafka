package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "kafka_topic", groupId = "kafka_cosumer_grp")
	public void listenToTopic(String receivedMessage) {
		System.out.println("The message received is :"+receivedMessage);
	}
}
