package com.kak.springbasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by akak on 2/8/2016.
 */
public class App {

    public static void main (String[] args) {
        ApplicationContext context;

        context = new FileSystemXmlApplicationContext("src\\com\\kak\\springbasics\\beans\\beans3.xml");

        Person person = (Person) context.getBean ("person");

        Address address2 = (Address) context.getBean("address2");
        System.out.println(address2);

        System.out.println (person.toString());

        FruitBasket fruitBasket = (FruitBasket) context.getBean("fruitBasket");
        System.out.println (fruitBasket.toString());

        Jungle myJungle = (Jungle) context.getBean("myJungle");
        System.out.println (myJungle.toString());

        ((FileSystemXmlApplicationContext) context).close();
    }
}
