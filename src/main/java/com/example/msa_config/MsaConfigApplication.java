package com.example.msa_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //Config Server로 동작하는 옵션
public class MsaConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaConfigApplication.class, args);
	}

}
