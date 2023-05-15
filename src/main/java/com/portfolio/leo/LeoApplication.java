package com.portfolio.leo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class LeoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeoApplication.class, args);
	}

	// public WebMvcConfigurer corsConfigurer() {
	// 	return new WebMvcConfigurer() {
	// 		@Override
	// 		public void addCorsMappings(CorsRegistry registry) {
	// 			registry.addMapping("/**").allowedOrigins("https://protfolio-argprog.web.app", "https://portfolio-backend-argprog.onrender.com").allowedMethods("*").allowedHeaders("*");
	// 		}
	// 	};
	// }
}
