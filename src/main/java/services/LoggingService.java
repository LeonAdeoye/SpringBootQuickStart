package services;

public interface LoggingService
{
    public enum LOG_LEVEL
    {
        TRACE,
        DEBUG,
        WARN,
        INFO,
        ERROR
    };

    public void logMessage(String component, String message, LOG_LEVEL logLevel);
    public void logMetric(String component, String metric, LOG_LEVEL logLevel);
}
