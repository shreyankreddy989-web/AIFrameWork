package com.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    Properties properties;

    public ConfigReader() {

        try {


            FileInputStream fis  = new FileInputStream();
            FileInputStream file =
                    new FileInputStream("src/test/resources/config.properties");

            properties = new Properties();

            properties.load(file);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public String getUrl() {

        return properties.getProperty("url");
    }
}