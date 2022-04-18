package ru.learnUp.learnupjava23;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Learnupjava23Application {

	private static final Logger log = LoggerFactory.getLogger(Learnupjava23Application.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Learnupjava23Application.class, args);
	}

}
