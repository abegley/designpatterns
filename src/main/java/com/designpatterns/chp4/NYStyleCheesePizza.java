package com.designpatterns.chp4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NYStyleCheesePizza implements Pizza {
    private static final Logger logger = LoggerFactory.getLogger(NYStyleCheesePizza.class);

    @Override
    public void prepare() {
        logger.info("Preparing NY cheese pizza");
    }

    @Override
    public void bake() {
        logger.info("Baking NY cheese pizza");
    }

    @Override
    public void cut() {
        logger.info("NY Cheese pizza sliced and diced");
    }

    @Override
    public void box() {
        logger.info("NY Cheese pizza boxed and ready for pick-up/delivery");
    }
}
