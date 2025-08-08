package com.automation.services;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogService {

    private static Level defaultLevel = Level.FINEST;

    public static void configureLogLevel() {
        defaultLevel = readLevel();
    }

    private static Level readLevel() {
        if (!PropertiesService.properties().isEmpty()) {
            String stringLevel = PropertiesService.properties().getProperty("automation.log.level");
            if (stringLevel == null)
                return Level.INFO;
            switch (stringLevel.toLowerCase()) {
                case "off":
                    return Level.OFF;
                case "severe":
                    return Level.SEVERE;
                case "warning":
                    return Level.WARNING;
                default:
                case "":
                case "info":
                    return Level.INFO;
                case "config":
                    return Level.CONFIG;
                case "fine":
                    return Level.FINE;
                case "finer":
                    return Level.FINER;
                case "finest":
                    return Level.FINEST;
                case "all":
                    return Level.ALL;
            }
        }
        return Level.INFO;
    }

    public static Logger getLogger() {
        Logger loggerWithLevel = Logger.getLogger("com.automation.test");
        if (loggerWithLevel.getHandlers().length == 0) {
            ConsoleHandler handler = new ConsoleHandler();
            handler.setLevel(defaultLevel);
            loggerWithLevel.addHandler(handler);
            loggerWithLevel.setLevel(defaultLevel);
            loggerWithLevel.setUseParentHandlers(false);
        }
        if (!loggerWithLevel.getLevel().getName().equals(defaultLevel.getName())) {
            loggerWithLevel.getHandlers()[0].setLevel(defaultLevel);
            loggerWithLevel.setLevel(defaultLevel);
        }
        return loggerWithLevel;
    }
}
