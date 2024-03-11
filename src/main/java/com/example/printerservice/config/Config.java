package com.example.printerservice.config;

import com.example.printerservice.model.ColorPrinter;
import com.example.printerservice.model.IPrintable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public IPrintable print() {
        return new ColorPrinter();
    }
}
