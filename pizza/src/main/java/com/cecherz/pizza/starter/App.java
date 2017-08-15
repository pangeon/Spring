
package com.cecherz.pizza.starter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cecherz.pizza.api.IOrder;
import com.cecherz.pizza.config.Config;
import com.cecherz.pizza.implementation.Order;


public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        /* bean nie ma nazwy, w tym wypadku jest lokalizowany po nazwie metody
           rzutowanie jest koniecznie, gdyż aplikacja nie wie czy chodzi o interfejs czy klasę
           która implementuje ten interfejs (IOrder opakowuje Order). */
        IOrder order = (IOrder) context.getBean("order");
        order.printOrder();
        
        /* takie lokalizowanie Beana wydaje się być bezpieczniejsze, można
        zmienić nazwę klasy bez konfliktu */
        IOrder order1 = (IOrder) context.getBean(Order.class);
        order1.printOrder(); // efekt działania metody jest identyczny
    }
    
}
