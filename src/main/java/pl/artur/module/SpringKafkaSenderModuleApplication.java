package pl.artur.module;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import com.google.gson.Gson;

import pl.artur.module.utils.*;

@SpringBootApplication
public class SpringKafkaSenderModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaSenderModuleApplication.class, args);
	}
	
	@Bean
	public Gson getGson() {
		return new Gson();
	}
	
	
}
