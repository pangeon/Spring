/* 
Klasa konfiguracyjna Springa
*/
package com.cecherz.pizza.config;

import com.cecherz.pizza.api.IOrder;
import com.cecherz.pizza.api.IPizza;
import com.cecherz.pizza.implementation.GoodPizza;
import com.cecherz.pizza.implementation.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //wymagane zależności w pliku pom.xl, NetBeans podpowiada
public class Config {
    /* wykorzystujemy technikę "odwróconego sterowania", normalnie trzeba by było podmieniać
    wszystkie wystąpienia nazwy GoodPizza w klasach aplikacji, a tak odpowiedzialność
    tę przejmuje klasa Config */ 
    @Bean
    public IPizza pizza() {
        // zdefiniowany konstruktor wymaga zdefiniowania ceny(int) i nazwy(String)
        return new GoodPizza(10, "Margerita"); 
    }
    @Bean
    // nie pojawia się null choć nie zdefiniowaliśmy 
    // Spring automatycznie sprawdza beany i wstrzykuje zależności (Dependency Injection)
    public IOrder order(IPizza pizza) { 
        // zdefiniowany konstruktor wymaga obiektu klasy IPizza
        return new Order(pizza);
    }
}
