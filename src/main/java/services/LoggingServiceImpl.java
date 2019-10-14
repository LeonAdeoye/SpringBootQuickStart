package services;

public class LoggingServiceImpl implements LoggingService
{
    public void logMessage(String component, String message, LOG_LEVEL logLevel)
    {
        System.out.println("log message");
    }

    public void logMetric(String component, String metric, LOG_LEVEL logLevel)
    {
        System.out.println("log metric");
    }
}