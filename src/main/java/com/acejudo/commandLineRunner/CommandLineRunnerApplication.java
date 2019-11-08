package com.acejudo.commandLineRunner;

import com.acejudo.service.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.acejudo.service"})
public class CommandLineRunnerApplication implements CommandLineRunner {

	@Autowired
	private GreetingService greetingService;

	@Value( "${name}" )
	private String name;

	private static Logger LOG = LoggerFactory.getLogger(CommandLineRunnerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CommandLineRunnerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info(greetingService.sayHello(name));
	}
}
