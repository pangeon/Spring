
package com.cecherz.pizza.starter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cecherz.pizza.api.IOrder;
import com.cecherz.pizza.config.AutoConfig;
import com.cecherz.pizza.implementation.Order;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        
        IOrder order = (IOrder) context.getBean(Order.class);
        order.printOrder();
        
        
    }
    
}
