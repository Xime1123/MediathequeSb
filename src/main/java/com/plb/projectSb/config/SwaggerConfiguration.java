package com.plb.projectSb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import java.util.Collections;


public class SwaggerConfiguration {
	@Bean
	public Docket api() {
		
		return  new Docket(DocumentationType.OAS_30)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.plb.projectSb.controller"))
		        .build();
	}
	 private ApiInfo apiInfo() {
	        return new ApiInfo(
	                "My Employee API", "Manage my employees",
	                "API v0.0.1", "",
	                new Contact("John Doe", "www.example.com", "myeaddress@company.com")
	                , "", "", Collections.emptyList());
	    }

}
