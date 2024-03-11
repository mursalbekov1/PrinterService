package com.example.printerservice.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ColorPrinter implements IPrintable{
    @Override
    public void print(String text) {
        log.info("Color text: " + text);
    }
}
