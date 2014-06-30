package com.designpatterns.chp4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChicagoStyleVeggiePizza implements Pizza {

    private static final Logger logger = LoggerFactory.getLogger(ChicagoStyleVeggiePizza.class);

    @Override
    public void prepare() {
        logger.info("Preparing Chicago veggie pizza");
    }

    @Override
    public void bake() {
        logger.info("Baking Chicago veggie pizza");
    }

    @Override
    public void cut() {
        logger.info("Chicago Veggie pizza sliced and diced");
    }

    @Override
    public void box() {
        logger.info("Chicago Veggie pizza boxed and ready for pick-up/delivery");
    }
}
