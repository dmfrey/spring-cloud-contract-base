package io.pivotal.dmfrey.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

import static java.util.Collections.singletonMap;

@SpringBootApplication
public class ApiApplication {

	public static void main( String[] args ) {

		SpringApplication.run( ApiApplication.class, args );

	}

}
