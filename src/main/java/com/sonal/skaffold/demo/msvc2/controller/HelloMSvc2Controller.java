package com.sonal.skaffold.demo.msvc2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonal.skaffold.demo.msvc2.connfig.GreetingsConfig;

import reactor.core.publisher.Mono;

@RestController
public class HelloMSvc2Controller {

	@Autowired
	private GreetingsConfig greetingsConfig;
	
	@GetMapping
	public Mono<String> helloMSvc1() {
		
		return Mono.just(greetingsConfig.getGreetingsMessage() + " Micro Service 2 working with Skaffold and Helm.");
	}
}
