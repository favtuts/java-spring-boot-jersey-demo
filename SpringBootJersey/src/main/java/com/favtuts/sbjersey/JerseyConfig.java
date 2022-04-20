package com.favtuts.sbjersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.favtuts.sbjersey.service.HelloService;
import com.favtuts.sbjersey.service.ReverseService;

@Component
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() {
		register(HelloService.class);
		register(ReverseService.class);
	}
}
