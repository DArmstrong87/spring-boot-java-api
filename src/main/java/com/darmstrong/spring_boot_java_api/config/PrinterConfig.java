//package com.darmstrong.spring_boot_java_api.config;
//
//import com.darmstrong.spring_boot_java_api.services.BluePrinter;
//import com.darmstrong.spring_boot_java_api.services.ColorPrinter;
//import com.darmstrong.spring_boot_java_api.services.GreenPrinter;
//import com.darmstrong.spring_boot_java_api.services.RedPrinter;
//import com.darmstrong.spring_boot_java_api.services.impl.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class PrinterConfig {
//
//    @Bean
//    public BluePrinter bluePrinter() {
//        return new SpanishBluePrinter();
//    }
//
//    @Bean
//    public GreenPrinter greenPrinter() {
//        return new SpanishGreenPrinter();
//    }
//
//    @Bean
//    public RedPrinter redPrinter() {
//        return new SpanishRedPrinter();
//    }
//
//    @Bean
//    public ColorPrinter colorPrinter(BluePrinter bluePrinter, GreenPrinter greenPrinter, RedPrinter redPrinter) {
//        return new ColorPrinterImpl(redPrinter, bluePrinter, greenPrinter);
//    }
//
//}
