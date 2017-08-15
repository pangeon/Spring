
package com.cecherz.pizza.implementation;

import com.cecherz.pizza.api.IPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // ta odnotacja "zastępuje" adnotacja @Bean w pliku konfiguracyjnym
public class Exotica implements IPizza {

    private int price;
    private String name;
    
    // musimy w tym wypadku zadeklarować domyślne wartości dla pól, by nie spowodować
    // wyrzucenia wyjątku (zawsze wpisujemy ciągi znaków, 
    // są one automatyczne konwertowane na typy danych
    public Exotica(@Value("12") int price, @Value("Exotica") String name) {
        /*
        super() - służy do wywoływania konstruktorów klasy nadrzędnej 
        (tej, z której dziedziczymy) o podanych parametrach, 
        lub w przypadku metod - odpowiedników o takiej samej 
        nazwie i podanych parametrach.
        */
        super(); 
        this.price = price;
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
