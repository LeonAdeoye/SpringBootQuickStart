package com.leon.services;

import com.leon.models.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors.*;
import java.util.stream.Collectors;

@Service
public class ConfigurationServiceImpl implements ConfigurationService
{
    private static final Logger logger = LoggerFactory.getLogger(ConfigurationServiceImpl.class);

    // TODO: change component name
    private static final String THIS_COMPONENT_NAME = "SpringBootQuickStart";
    private static final String SYSTEM = "system";
    private static Map<String, Map<String,Configuration>> configurations;

    @Autowired
    private MessagingService messagingService;


    public ConfigurationServiceImpl()
    {

    }

    @PostConstruct
    public void initialize()
    {
        loadAllConfigurations();
    }

    @Override
    public String getComponentConfigurationValue(String key)
    {
        return this.configurations.get(key).get(SYSTEM).getValue();
    }

    @Override
    public String getSystemConfigurationValue(String key)
    {
        return this.configurations.get(key).get(THIS_COMPONENT_NAME).getValue();
    }

    @Override
    public void saveConfiguration(String owner, String key, String value)
    {
        Configuration configuration = new Configuration(owner, key, value);
        logger.info("Saving configuration: ", configuration);
        this.messagingService.saveConfiguration(configuration);
    }

    @Override
    public void loadAllConfigurations()
    {
        List<Configuration> loadedConfigurations = this.messagingService.loadAllConfigurations();
        loadedConfigurations.stream().collect(Collectors.groupingBy(Configuration::getKey, Collectors.groupingBy(Configuration::getOwner)));
    }

    @Override
    public void reconfigure()
    {
        logger.info("Reconfiguring...");
        this.loadAllConfigurations();
    }
}