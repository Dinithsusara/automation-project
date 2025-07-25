package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils {

    private static String defaultFilePath = System.getProperty("user.dir") + "/src/main/resources/config.properties";
    private static Properties properties = null;


    private static void loadProperties() {
        properties = new Properties();
        InputStream input;
        try {
            input = new FileInputStream(defaultFilePath);
            properties.load(input);
        } catch (IOException e) {
            //BrakesLoggerUtil.log(e);
        }
    }

    public static String getProperty(String key) {
        if (properties == null)
            loadProperties();

        String p = System.getProperty(key);
        return p != null ? p : properties.getProperty(key);
    }
}
