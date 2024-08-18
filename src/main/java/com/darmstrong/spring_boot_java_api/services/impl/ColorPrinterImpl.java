package com.darmstrong.spring_boot_java_api.services.impl;

import com.darmstrong.spring_boot_java_api.services.BluePrinter;
import com.darmstrong.spring_boot_java_api.services.ColorPrinter;
import com.darmstrong.spring_boot_java_api.services.GreenPrinter;
import com.darmstrong.spring_boot_java_api.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColorPrinterImpl implements ColorPrinter {

    private RedPrinter redPrinter;

    private BluePrinter bluePrinter;

    private GreenPrinter greenPrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print(){
        return redPrinter.print() + " " + bluePrinter.print() + " " + greenPrinter.print();
    }
}
