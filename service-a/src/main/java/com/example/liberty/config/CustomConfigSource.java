package com.example.liberty.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

import org.eclipse.microprofile.config.spi.ConfigSource;

public class CustomConfigSource implements ConfigSource {

    @Override
    public Set<String> getPropertyNames() {
        
        return Collections.singleton("customer.name");
    }

    @Override
    public String getValue(String propertyName) {
        
        return "Alice";
    }

    @Override
    public String getName() {
        
        return "CustomConfigSource";
    }

    @Override
    public int getOrdinal() {
        return 120;
    }
    
}
