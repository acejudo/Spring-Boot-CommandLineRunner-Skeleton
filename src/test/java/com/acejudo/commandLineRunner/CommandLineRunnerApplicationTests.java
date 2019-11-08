package com.acejudo.commandLineRunner;

import com.acejudo.service.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes =  CommandLineRunnerApplicationTestsConfig.class)

class CommandLineRunnerApplicationTests {

	@Autowired
	GreetingService greetingService;

	@Value( "${greet}" )
	private String greet;

	@Value( "${name}" )
	private String name;

	@Test
	void contextLoads() {
	}

	@Test
	void sayHello(){
		assertEquals(greetingService.sayHello(name), String.format("%s %s", greet, name));
	}

}
