package com.kak.springbasics;

/**
 * Created by akak on 2/8/2016.
 */
public class Person {
    private int id;
    private String name;
    private int taxId;
    private Address address;

    public static Person getInstance (int id, String name) {
        System.out.println("Creating person using factory method");
        return new Person(id, name);
    }

    public Person() {

    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void doSomething () {
        System.out.println ("Person created " +this);
    }

    public void doAnotherThing () {
        System.out.println("Person destroyed " +this);
    }

    public void speak () {
        System.out.println ("I am a person");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaxId (int taxId) {
        this.taxId = taxId;
    }

    public void setAddress (Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                ", address=" + address +
                '}';
    }
}
