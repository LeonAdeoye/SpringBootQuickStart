package com.leon.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class MainController
{
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping("/reconfigure")
    public void reconfigure()
    {
        logger.info("Received request to configure.");
    }
}