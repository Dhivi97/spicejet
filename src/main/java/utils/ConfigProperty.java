package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperty {
	
	 public Properties properties;

	    public ConfigProperty() throws IOException {
	        FileInputStream fis = new FileInputStream("C:\\Users\\boopa\\eclipse-workspace\\Project1\\src\\main\\java\\utils\\Config.Properties");
	        properties = new Properties();
	        properties.load(fis);
	    }

	    public String getBrowser() {
	        return properties.getProperty("browser");
	    }

	    public  String getUrl() {
	        return properties.getProperty("url");
	    }
	}


