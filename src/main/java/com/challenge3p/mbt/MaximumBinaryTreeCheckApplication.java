package com.challenge3p.mbt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MaximumBinaryTreeCheckApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(MaximumBinaryTreeCheckApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MaximumBinaryTreeCheckApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		LOG.info("Executing: command line runner");
		new CommandLineLoop().run();
	}




}
