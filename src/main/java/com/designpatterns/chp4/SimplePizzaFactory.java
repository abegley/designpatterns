package com.designpatterns.chp4;

/**
 Factory pattern example
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if("cheese".equals(type)){
            pizza = new CheesePizza();
        }
        if("pepperoni".equals(type)){
            pizza = new PepperoniPizza();
        }
        if("clam".equals(type)){
            pizza = new ClamPizza();
        }
        if("veggie".equals(type)){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
