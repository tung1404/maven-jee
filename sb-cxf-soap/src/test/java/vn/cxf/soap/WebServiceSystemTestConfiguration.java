package vn.cxf.soap;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.codecentric.namespace.weatherservice.WeatherService;

@Configuration
public class WebServiceSystemTestConfiguration {
    
    @Bean
    public WeatherService weatherServiceSystemTestClient() {
        JaxWsProxyFactoryBean jaxWsProxyFactory = new JaxWsProxyFactoryBean();
        jaxWsProxyFactory.setServiceClass(WeatherService.class);
        jaxWsProxyFactory.setAddress("http://localhost:8090" + WebServiceConfiguration.BASE_URL + WebServiceConfiguration.SERVICE_URL);
        return (WeatherService) jaxWsProxyFactory.create();
    }
}
