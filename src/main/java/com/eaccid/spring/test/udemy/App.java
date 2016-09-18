package com.eaccid.spring.test.udemy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Person person = (Person) context.getBean("person");
        person.setTaxId(666);
        System.out.println(person);


        ((ClassPathXmlApplicationContext) context).close();


    }
}