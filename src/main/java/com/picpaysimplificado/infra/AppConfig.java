package com.picpaysimplificado.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    @Bean
    public RestTemplate restTemplate(){
        //dessa forma, o Bean sera capaz de fazer a injecao das classes
        //que sao dependentes do rest template
        return new RestTemplate();
    } 
}
