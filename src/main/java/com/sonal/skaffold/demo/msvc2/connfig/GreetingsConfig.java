package com.sonal.skaffold.demo.msvc2.connfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
public class GreetingsConfig {

	@Value("${com.sonal.skaffold.demo.msvc1.greetings.message}")
	private String greetingsMessage;
}
