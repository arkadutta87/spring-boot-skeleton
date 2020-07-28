package org.bongcoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("org.bongcoder.persistence.repository")
@EntityScan("org.bongcoder.persistence.model")
@SpringBootApplication
public class SpringBootSkeletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSkeletonApplication.class, args);
	}

}
