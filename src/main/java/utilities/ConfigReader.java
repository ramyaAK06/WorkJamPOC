package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    Properties properties = new Properties();

    public ConfigReader() throws IOException {
        File src = new File("/Users/ramyaakulkarni/bcg_Project/bcgProject/WorkJamPOC/src/main/resources/Application.Properties");
        FileInputStream fileInputStream = new FileInputStream(src);
        properties.load(fileInputStream);
    }

    public String getBaseUrl(String baseUrl){
        return properties.getProperty("baseUrl");
    }
}
