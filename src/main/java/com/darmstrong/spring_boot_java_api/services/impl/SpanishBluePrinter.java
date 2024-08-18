package com.darmstrong.spring_boot_java_api.services.impl;

import com.darmstrong.spring_boot_java_api.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class SpanishBluePrinter extends BluePrinter {

    @Override
    public String print() {
        return "azul";
    }
}
