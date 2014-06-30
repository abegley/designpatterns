package com.designpatterns.chp4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheesePizza implements Pizza {

    private static final Logger logger = LoggerFactory.getLogger(CheesePizza.class);

    @Override
    public void prepare() {
       logger.info("Preparing cheese pizza");
    }

    @Override
    public void bake() {
        logger.info("Baking cheese pizza");
    }

    @Override
    public void cut() {
        logger.info("Cheese pizza sliced and diced");
    }

    @Override
    public void box() {
        logger.info("Cheese pizza boxed and ready for pick-up/delivery");
    }
}
