package org.raghav.Utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertiesFile {

    public Properties loadFile(String filePath) {
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader(filePath)) {
            properties.load(fileReader);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }
}
