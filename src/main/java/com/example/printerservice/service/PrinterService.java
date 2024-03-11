package com.example.printerservice.service;

import com.example.printerservice.model.BWPrinter;
import com.example.printerservice.model.IPrintable;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PrinterService {

    private final IPrintable printer;

    public void print(String text) {
        printer.print(text);
    }
}
