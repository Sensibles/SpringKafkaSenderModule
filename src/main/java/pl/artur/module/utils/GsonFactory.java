package pl.artur.module.utils;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;



@Component
public class GsonFactory {
	
	public Gson getGson() {
		return new Gson();
	}

}
