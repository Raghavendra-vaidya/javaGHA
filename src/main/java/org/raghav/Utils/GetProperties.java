package org.raghav.Utils;

import java.util.Properties;

public class GetProperties {
    LoadPropertiesFile propertiesFile;

    public String keyFromFile(String filePath, String KEY) {
        String value = null;
        propertiesFile = new LoadPropertiesFile();
        Properties properties = propertiesFile.loadFile(filePath);
        value = properties.getProperty(KEY);
        return value;
    }
}
