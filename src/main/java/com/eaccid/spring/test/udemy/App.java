package com.eaccid.spring.test.udemy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); //new FileSystemXmlApplicationContext("com.eaccid.spring.test.udemy.beans.xml");

        Person person = (Person) context.getBean("person");
        person.speak();
        System.out.println(person);

        Address address = (Address) context.getBean("address");
        System.out.println(address);


        ((ClassPathXmlApplicationContext) context).close();


    }
}