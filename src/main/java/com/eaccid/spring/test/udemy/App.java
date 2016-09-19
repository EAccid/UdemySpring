package com.eaccid.spring.test.udemy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beansAnnotations.xml");

        Logger logger = (Logger)context.getBean("logger");

        logger.writeConsole("Hello there");
        logger.writeFile("Hi again");

        ((ClassPathXmlApplicationContext) context).close();


    }
}