package com.repro.springnativeresources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.nativex.hint.ResourceHint;

@ResourceHint(patterns = {"^static/.*"})
@SpringBootApplication
public class SpringNativeResourcesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNativeResourcesApplication.class, args);
	}

}
