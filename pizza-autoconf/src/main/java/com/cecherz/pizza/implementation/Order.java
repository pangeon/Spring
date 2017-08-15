
package com.cecherz.pizza.implementation;

import com.cecherz.pizza.api.IOrder;
import com.cecherz.pizza.api.IPizza;
import org.springframework.stereotype.Component;

@Component // ta odnotacja "zastępuje" adnotacja @Bean w pliku konfiguracyjnym
public class Order implements IOrder{

    private IPizza pizza;
    // nie musimy korzystać z adnotacji @Value
    public Order(IPizza pizza) {
        /*
        super() - służy do wywoływania konstruktorów klasy nadrzędnej 
        (tej, z której dziedziczymy) o podanych parametrach, 
        lub w przypadku metod - odpowiedników o takiej samej 
        nazwie i podanych parametrach.
        */
        super();
        this.pizza = pizza;
    }
    @Override
    public void printOrder() {
        System.out.println("Zamówienie: " + pizza.getName() + " | Cena: " + pizza.getPrice());
    }
    
    
    
}
