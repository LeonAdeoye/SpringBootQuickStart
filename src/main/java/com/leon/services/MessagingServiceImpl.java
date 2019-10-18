package com.leon.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MessagingServiceImpl implements MessagingService
{
    private static final Logger logger = LoggerFactory.getLogger(MessagingServiceImpl.class);

    public void sendGetRequest(String destination, String message)
    {
    }

    public void sendPostRequest(String destination, String message)
    {
    }

    public void sendPostMetric(String destination, String key, String value)
    {
    }
}