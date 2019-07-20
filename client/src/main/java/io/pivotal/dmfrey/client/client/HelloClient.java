package io.pivotal.dmfrey.client.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpMethod.POST;

@Component
public class HelloClient {

    private final RestTemplate restTemplate;


    public HelloClient( final RestTemplate restTemplate ) {

        this.restTemplate = restTemplate;

    }

    public ResponseEntity<String> callHello( final String name ) {

        return this.restTemplate.exchange( "http://api/sayHello?name={name}", POST, null, String.class, name );
    }

}
