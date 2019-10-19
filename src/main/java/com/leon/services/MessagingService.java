package com.leon.services;

import com.leon.models.Configuration;

import java.util.List;

public interface MessagingService
{
    public void saveConfiguration(Configuration configfuration);
    public List<Configuration> loadAllConfigurations();
}