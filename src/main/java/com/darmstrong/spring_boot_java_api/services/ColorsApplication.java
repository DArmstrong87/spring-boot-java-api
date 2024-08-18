package com.darmstrong.spring_boot_java_api.services;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// Alias for @Configuration, @ComponentScan, @EnableAutoConfiguration
//@ComponentScan({"com.darmstrong.spring_boot_java_api.config"})
public class ColorsApplication implements CommandLineRunner {

    private ColorPrinter colorPrinter;

    public ColorsApplication(ColorPrinter colorPrinter) {
        this.colorPrinter = colorPrinter;
    }

    public static void main(String[] args) {
        SpringApplication.run(ColorsApplication.class, args);
    }

    @Override
    public void run(final String... args) {
        System.out.println(colorPrinter.print());
    }
}
