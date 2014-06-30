package com.designpatterns.chp4;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NYStylePepperoniPizza implements Pizza {
    private static final Logger logger = LoggerFactory.getLogger(NYStylePepperoniPizza.class);

    @Override
    public void prepare() {
        logger.info("Preparing NY pepperoni pizza");
    }

    @Override
    public void bake() {
        logger.info("Baking NY pepperoni pizza");
    }

    @Override
    public void cut() {
        logger.info("Pepperoni NY pizza sliced and diced");
    }

    @Override
    public void box() {
        logger.info("NY Pepperoni pizza boxed and ready for pick-up/delivery");
    }
}
