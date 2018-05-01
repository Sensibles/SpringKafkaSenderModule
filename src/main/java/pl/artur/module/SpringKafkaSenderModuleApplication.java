package pl.artur.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@SpringBootApplication
public class SpringKafkaSenderModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaSenderModuleApplication.class, args);
	}
	
	
	@Bean
	public Gson getGson() {
		return new GsonBuilder().setPrettyPrinting().create();
	}
}
