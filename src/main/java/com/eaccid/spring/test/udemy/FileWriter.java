package com.eaccid.spring.test.udemy;

import org.springframework.stereotype.Component;

@Component
public class FileWriter implements LogWriter {
    public void write(String text) {
        // Write to a file here.
        // Dummy implementation
        System.out.println("Write to file: " + text);
    }
}
