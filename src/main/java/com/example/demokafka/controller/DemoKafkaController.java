package com.example.demokafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demokafka.service.Producer;

@RestController
@RequestMapping(value = "/kafka")
public class DemoKafkaController {

	@Autowired
	private Producer producer;

	@GetMapping(value = "/publish")
	public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
		this.producer.produce(message);
	}
}
