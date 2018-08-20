package com.example.SubSvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@SpringBootApplication
@RestController
public class SubSvcApplication {

	@RequestMapping("/")
	public String hello() {
	  return "Hello World!";
	}

	@Autowired
	RestTemplate restTemplate;

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@RequestMapping("/test-pub-svc")
	public String foo() {
//		URI uri = UriComponentsBuilder.fromUriString("//pub-svc:8080/").build().toUri();
		String result = restTemplate.getForObject("http://pub-svc:8080",String.class);
		return result;
	}

	public static void main(String[] args) {
		SpringApplication.run(SubSvcApplication.class, args);
	}
}
