package com.leon.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationServiceImpl implements ConfigurationService
{
    private static final Logger logger = LoggerFactory.getLogger(ConfigurationServiceImpl.class);
    private static final String configurationServiceDestination = "http://localHost:21001";
    private static final String template = "{key: %s, value: %s}";

    @Autowired
    private MessagingService messagingService;


    public ConfigurationServiceImpl()
    {

    }

    public void initialize()
    {

    }

    @Override
    public String getConfiguration(String key)
    {
        return null;
    }

    @Override
    public void setConfiguration(String key, String value)
    {
        logger.info("Saving configuration: ", String.format(template, key, value));

        this.messagingService.sendPostRequest(configurationServiceDestination, String.format(template, key, value));
    }

    @Override
    public void loadAll()
    {

    }

    @Override
    public void reconfigure()
    {
        logger.info("Reconfiguring...");
    }
}