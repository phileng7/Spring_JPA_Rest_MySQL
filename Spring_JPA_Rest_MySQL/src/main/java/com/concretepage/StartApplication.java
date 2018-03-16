package com.concretepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
http://localhost:8080/user/articles
http://localhost:8080/user/article/{id}
POST:
http://localhost:8080/user/article
PUT (update):
http://localhost:8080/user/article
DELETE:
http://localhost:8080/user/article/{id}
 */
@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
}
