package com.example.printerservice.service;

import com.example.printerservice.model.BWPrinter;
import com.example.printerservice.model.IPrintable;
import org.springframework.stereotype.Service;

@Service
public class PrinterService {

    IPrintable printer;

    public PrinterService(IPrintable printer) {
        this.printer = printer;
    }

    public void print(String text) {
        printer.print(text);
    }
}
