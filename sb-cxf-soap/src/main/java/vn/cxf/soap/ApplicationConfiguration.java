package vn.cxf.soap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import vn.cxf.soap.controller.WeatherServiceController;

@Configuration
public class ApplicationConfiguration {

	@Bean
	public WeatherServiceController weatherServiceController() {
		return new WeatherServiceController();
	}
}