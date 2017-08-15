
package com.cecherz.pizza.implementation;

import com.cecherz.pizza.api.IPizza;
import com.cecherz.pizza.api.INoCheese;

/* klasa "nie jest" komponentem, jej zachowanie definiuje klasa Config
   klasa definiuje gatunek pizzy z możliwością dodania sera lub nie
   jako jedyna implentuje dodatkowy interfejs */
public class Pesto implements IPizza, INoCheese {

    private int price;
    private String name;
    private boolean addCheese;

    public Pesto(int price, String name, boolean addCheese) {
        super(); 
        this.price = price;
        this.name = name;
        this.addCheese = addCheese;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public boolean checkCheeseOnPizza() {
        return addCheese;
    }

    public void AddCheese(boolean addCheese) {
        this.addCheese = addCheese;
        if (addCheese == true) {
            System.out.println("dodano ser do pizzy");
        } else {
            System.out.println("pizza bez sera");
        }
    }    
}
