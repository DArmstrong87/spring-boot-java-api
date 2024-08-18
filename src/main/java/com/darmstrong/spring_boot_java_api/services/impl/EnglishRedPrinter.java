package com.darmstrong.spring_boot_java_api.services.impl;

import com.darmstrong.spring_boot_java_api.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter extends RedPrinter {

    @Override
    public String print() {
        return "red";
    }

    ;
}
