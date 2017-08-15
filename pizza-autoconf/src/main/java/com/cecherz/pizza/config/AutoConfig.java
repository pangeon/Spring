/* 
Klasa konfiguracyjna Springa
*/
package com.cecherz.pizza.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// pusta klasa konfiguracyjna musi zostać napisana w celu uruchomienia
// automatycznej konfiguracji, podajemy tylko nazwę pakietu, który będziemy skanować
@ComponentScan("com.cecherz.pizza.implementation")
@Import(Config.class) // w przypadku klasy IPizza wykorzystuje nie-automatyczną konfigurację
public class AutoConfig {

}
