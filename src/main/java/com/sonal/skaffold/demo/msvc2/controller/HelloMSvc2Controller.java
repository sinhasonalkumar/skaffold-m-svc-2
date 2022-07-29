package com.sonal.skaffold.demo.msvc2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HelloMSvc2Controller {

	
	@GetMapping
	public Mono<String> helloMSvc1() {
		
		return Mono.just("Hello From Micro Service 2");
	}
}
