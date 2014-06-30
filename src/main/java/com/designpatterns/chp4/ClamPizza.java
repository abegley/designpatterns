package com.designpatterns.chp4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClamPizza implements Pizza {
    private static final Logger logger = LoggerFactory.getLogger(ClamPizza.class);

    @Override
    public void prepare() {
        logger.info("Preparing clam pizza");
    }

    @Override
    public void bake() {
        logger.info("Baking clam pizza");
    }

    @Override
    public void cut() {
        logger.info("Clam pizza sliced and diced");
    }

    @Override
    public void box() {
        logger.info("Clam pizza boxed and ready for pick-up/delivery");
    }
}
