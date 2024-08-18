package com.darmstrong.spring_boot_java_api.services.impl;

import com.darmstrong.spring_boot_java_api.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreenPrinter extends GreenPrinter {

    @Override
    public String print() {
        return "green";
    }

    ;
}
