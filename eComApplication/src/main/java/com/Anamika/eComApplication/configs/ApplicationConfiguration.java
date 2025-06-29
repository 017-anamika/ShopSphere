package com.Anamika.eComApplication.configs;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Data
@Configuration
public class ApplicationConfiguration {
    @Bean
    public String getStringBean(){
        return "This is my Bean";
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
