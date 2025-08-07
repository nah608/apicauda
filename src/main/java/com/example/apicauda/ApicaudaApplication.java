package com.example.apicauda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ApicaudaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApicaudaApplication.class, args);
	}
        
        @Bean
public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOriginPatterns("*")
                    //.allowCredentials(true)  // coméntalo para probar primero
                    .allowedHeaders("Origin", "Authorization", "Content-Type")
                    .allowedMethods("GET", "POST", "PUT", "DELETE");
        }
    };
}

}
