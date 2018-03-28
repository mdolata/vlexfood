package pl.mdolat.vlexfood.vlexfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class VlexfoodApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(VlexfoodApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(VlexfoodApplication.class, args);
	}
}
