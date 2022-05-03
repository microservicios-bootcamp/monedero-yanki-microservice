package com.demo.app.monedero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableReactiveMongoAuditing
@EnableReactiveMongoRepositories
@EnableScheduling
@SpringBootApplication
public class MonederoYankiMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonederoYankiMicroserviceApplication.class, args);
	}

}
