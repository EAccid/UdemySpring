package com.eaccid.spring.test.udemy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

//        ApplicationContext context = new FileSystemXmlApplicationContext("com.eaccid.spring.test.udemy.beans.xml");
//        Person person = (Person) context.getBean("person");
//        person.speak();
//        ((FileSystemXmlApplicationContext) context).close();

        //src/main/java/com/eaccid/spring/test/udemy/beans/beans.xml"
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) context.getBean("person");
        person.speak();

        System.out.println(person);

        ((ClassPathXmlApplicationContext) context).close();


    }
}