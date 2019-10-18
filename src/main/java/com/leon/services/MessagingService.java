package com.leon.services;

public interface MessagingService
{
    public void sendGetRequest(String destination, String message);
    public void sendPostRequest(String destination, String message);
    public void sendPostMetric(String destination, String key, String value);
}