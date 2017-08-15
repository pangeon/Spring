/* 
Klasa konfiguracyjna Springa
*/
package com.cecherz.pizza.config;

import com.cecherz.pizza.api.IPizza;
import com.cecherz.pizza.implementation.Pesto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public IPizza pizza() {
        return new Pesto(15, "Pesto", false); 
    }
    
}
