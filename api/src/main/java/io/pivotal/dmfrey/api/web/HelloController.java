package io.pivotal.dmfrey.api.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.util.Collections.singletonMap;

@RestController
public class HelloController {

	private static final Logger log = LoggerFactory.getLogger( HelloController.class );

	@PostMapping( value = "/sayHello", params = "name" )
	public ResponseEntity<Map<String, Object>> sayHello( @RequestParam( "name" ) String name ) {
		log.info( "sayHello : enter, name={}", name );

		return ResponseEntity
				.ok( singletonMap( "message", String.format( "Hello, %s", name ) ) );
	}

}