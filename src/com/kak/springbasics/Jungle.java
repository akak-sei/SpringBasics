package com.kak.springbasics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by akak on 2/8/2016.
 */
public class Jungle {
    private Animal largest;
    private List<Animal> animals;
    private Map<String, String> foods = new HashMap<String, String>();
    private Map<String, Animal> smallAnimals = new HashMap<String, Animal>();

    public Animal getLargest () {
        return largest;
    }

    public void setFoods (Map<String, String> foods) {
        this.foods = foods;
    }

    public void setSmallAnimals (Map<String, Animal> smallAnimals) {
        this.smallAnimals = smallAnimals;
    }

    public void setLargest (Animal largest) {
        this.largest = largest;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals (List<Animal> animals) {
        this.animals = animals;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder ();

        sb.append("Jungle contains:\n");

        for (Animal animal : animals) {
            sb.append (animal);
            sb.append ("\n");
        }

        sb.append("and " +largest.toString() +" is the largest\n");

        for (Map.Entry<String, String> entry: foods.entrySet()) {
            sb.append("Food " +entry.getKey() +": " +entry.getValue() + "\n");
        }

        for (Map.Entry<String, Animal> entry: smallAnimals.entrySet()) {
            sb.append("Small Animal " +entry.getKey() +": " +entry.getValue() + "\n");
        }

        return sb.toString();
    }
}
