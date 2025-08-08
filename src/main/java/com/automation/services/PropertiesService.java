package com.automation.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.logging.Logger;

public class PropertiesService {
    private static final Logger logger = LogService.getLogger();
    private static final Properties properties = new Properties();

    static {
        try {
            properties.load(Files.newInputStream(Paths.get("automation.properties")));
        } catch (IOException e) {
            logger.warning("error loading properties of the file 'automation.properties'");
        }
    }

    public static Properties properties() {
        return properties;
    }

    public static String getProperty(String key) {
        String value = System.getenv(key);
        if (value == null || value.isEmpty()) value = System.getProperty(key);
        if (value == null || value.isEmpty()) value = properties.getProperty(key);
        if (value == null) logger.warning("the property '" + key + "' is not defined, may be required");
        return value;
    }

    public static void setProperty(String key, String value) {
        System.setProperty(key, value);
    }

    public static boolean getBooleanProperty(String property) {
        return Boolean.parseBoolean(getProperty(property));
    }
}
