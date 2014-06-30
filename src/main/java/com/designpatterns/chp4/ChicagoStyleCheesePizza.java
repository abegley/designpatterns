package com.designpatterns.chp4;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChicagoStyleCheesePizza implements Pizza {
    private static final Logger logger = LoggerFactory.getLogger(ChicagoStyleCheesePizza.class);

    @Override
    public void prepare() {
        logger.info("Preparing Chicago cheese pizza");
    }

    @Override
    public void bake() {
        logger.info("Baking Chicago cheese pizza");
    }

    @Override
    public void cut() {
        logger.info("Chicago Cheese pizza sliced and diced");
    }

    @Override
    public void box() {
        logger.info("Chicago Cheese pizza boxed and ready for pick-up/delivery");
    }
}
