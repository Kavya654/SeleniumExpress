package com.love.calculator.demo;

import com.love.calculator.demo.formatter.PhoneNumberFormatter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Configuration
	static  class MyConfig extends WebMvcConfigurerAdapter{

		@Override
		public void addFormatters(FormatterRegistry registry) {
			registry.addFormatter(new PhoneNumberFormatter());
		}
	}

}
