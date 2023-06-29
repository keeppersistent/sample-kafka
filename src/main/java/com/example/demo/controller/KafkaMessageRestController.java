package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Producer;

@RestController
@RequestMapping("/api/rest/kafkaDemo")
public class KafkaMessageRestController {

	@Autowired
	Producer producer;
	
	@GetMapping("/producer")
	public void kafka(@RequestParam("message") String msg) {
		producer.sendMsgToTopic(msg);
	}
}
