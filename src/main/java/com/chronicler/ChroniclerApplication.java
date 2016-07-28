package com.chronicler;

import org.neo4j.graphdb.GraphDatabaseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.rest.SpringCypherRestGraphDatabase;

@SpringBootApplication
@EnableNeo4jRepositories
@Configuration
public class ChroniclerApplication extends Neo4jConfiguration {

	public ChroniclerApplication() {
		setBasePackage("com.chronicler");
	}

	@Bean(destroyMethod = "shutdown")
	public GraphDatabaseService graphDatabaseService() {
		return new SpringCypherRestGraphDatabase("http://192.168.99.100:32769/db/data", "neo4j", "password");
	}
	public static void main(String[] args) {
		SpringApplication.run(ChroniclerApplication.class, args);
	}
	
	
}
