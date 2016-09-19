package com.eaccid.spring.test.udemy;

public class ConsoleWriter implements LogWriter{
    public void write(String text) {
        System.out.println(text);
    }
}
