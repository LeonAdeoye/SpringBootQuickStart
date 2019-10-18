package com.leon.services;

public interface ConfigurationService
{
    public String getConfiguration(String key);
    public void setConfiguration(String key, String value);
    public void loadAll();
    public void reconfigure();
}