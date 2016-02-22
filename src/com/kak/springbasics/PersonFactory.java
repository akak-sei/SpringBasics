package com.kak.springbasics;

/**
 * Created by akak on 2/8/2016.
 */
public class PersonFactory {

    public Person createPerson (int id, String name) {
        System.out.println ("Using Factory class to create bean");
        return new Person (id, name);
    }
}
