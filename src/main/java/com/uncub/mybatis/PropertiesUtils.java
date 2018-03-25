package com.uncub.mybatis;

import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
    private final static Properties properties  = new Properties();;

    static {
        try {
            properties.load(PropertiesUtils.class.getResourceAsStream("/generator.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key){
        String value = (String) properties.get(key);
        return StringUtils.isBlank(value) ? "" : value;
    }

}
