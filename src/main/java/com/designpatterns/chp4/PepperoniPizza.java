package com.designpatterns.chp4;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PepperoniPizza implements Pizza {
    private static final Logger logger = LoggerFactory.getLogger(PepperoniPizza.class);

    @Override
    public void prepare() {
        logger.info("Preparing pepperoni pizza");
    }

    @Override
    public void bake() {
        logger.info("Baking pepperoni pizza");
    }

    @Override
    public void cut() {
        logger.info("Pepperoni pizza sliced and diced");
    }

    @Override
    public void box() {
        logger.info("Pepperoni pizza boxed and ready for pick-up/delivery");
    }
}
