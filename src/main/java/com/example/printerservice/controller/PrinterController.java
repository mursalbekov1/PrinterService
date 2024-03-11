package com.example.printerservice.controller;

import com.example.printerservice.PrinterServiceApplication;
import com.example.printerservice.model.ColorPrinter;
import com.example.printerservice.service.PrinterService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PrinterController {

    private final PrinterService printerService;

    @GetMapping("/print")
    public String print(@RequestParam(value = "text", defaultValue = "Hello") String text) {
        printerService.print(text);
        return "Hello world!";
    }

}
