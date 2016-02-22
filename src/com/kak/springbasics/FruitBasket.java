package com.kak.springbasics;

import java.util.List;

/**
 * Created by akak on 2/8/2016.
 */
public class FruitBasket {
    private String name;
    private List<String> fruits;

    public FruitBasket (String name, List<String> fruits) {
        this.name = name;
        this.fruits = fruits;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder ();

        sb.append(name);
        sb.append(" contains:\n");

        for (String fruit : fruits) {
            sb.append (fruit);
            sb.append ("\n");
        }

        return sb.toString();
    }
}
