package com.example.springdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseLoggerController{
    private Logger logger;

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public BaseLoggerController() {
        this.logger=LoggerFactory.getLogger(this.getClass());
    }
}
