package com.example.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DbConfig {
    public DbConfig() {
        final String resource = "config/db.properties";
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(resource));
        } catch (IOException e) {
        }
        this.JDBC_DRIVER = properties.getProperty("JDBC_DRIVER");
        this.DB_URL = properties.getProperty("DB_URL");
        this.USER = properties.getProperty("USER");
        this.PASS = properties.getProperty("PASS");
    }

    public final String JDBC_DRIVER;
    public final String DB_URL;
    public final String USER;
    public final String PASS;
}
