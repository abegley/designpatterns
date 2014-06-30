package com.designpatterns.chp4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChicagoStylePepperoniPizza implements Pizza {

    private static final Logger logger = LoggerFactory.getLogger(ChicagoStylePepperoniPizza.class);

    @Override
    public void prepare() {
        logger.info("Preparing Chicago pepperoni pizza");
    }

    @Override
    public void bake() {
        logger.info("Baking Chicago pepperoni pizza");
    }

    @Override
    public void cut() {
        logger.info("Chicago Pepperoni pizza sliced and diced");
    }

    @Override
    public void box() {
        logger.info("Chicago Pepperoni pizza boxed and ready for pick-up/delivery");
    }
}
