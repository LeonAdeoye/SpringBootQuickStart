package com.leon.services;

import com.leon.models.Configuration;

import java.util.List;

public interface ConfigurationService
{
    public String getSystemConfigurationValue(String key);
    public String getComponentConfigurationValue(String key);
    public void saveConfiguration(String owner, String key, String value);
    public void loadAllConfigurations();
    public void reconfigure();
}