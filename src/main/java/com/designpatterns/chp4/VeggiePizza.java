package com.designpatterns.chp4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VeggiePizza implements Pizza {
    private static final Logger logger = LoggerFactory.getLogger(VeggiePizza.class);

    @Override
    public void prepare() {
        logger.info("Preparing veggie pizza");
    }

    @Override
    public void bake() {
        logger.info("Baking veggie pizza");
    }

    @Override
    public void cut() {
        logger.info("Veggie pizza sliced and diced");
    }

    @Override
    public void box() {
        logger.info("Veggie pizza boxed and ready for pick-up/delivery");
    }
}
