
package com.cecherz.pizza.implementation;

import com.cecherz.pizza.api.IPizza;

public class GoodPizza implements IPizza {

    private int price;
    private String name;

    public GoodPizza(int price, String name) {
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
