package com.designpatterns.chp4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NYStyleClamPizza implements Pizza {
    private static final Logger logger = LoggerFactory.getLogger(NYStyleClamPizza.class);

    @Override
    public void prepare() {
        logger.info("Preparing NY clam pizza");
    }

    @Override
    public void bake() {
        logger.info("Baking NY clam pizza");
    }

    @Override
    public void cut() {
        logger.info("NY Clam pizza sliced and diced");
    }

    @Override
    public void box() {
        logger.info("NY Clam pizza boxed and ready for pick-up/delivery");
    }
}
