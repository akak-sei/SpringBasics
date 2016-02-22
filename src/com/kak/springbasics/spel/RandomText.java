package com.kak.springbasics.spel;

import java.util.Random;

/**
 * Created by akak on 2/9/2016.
 */
public class RandomText {

    private static String[] texts = {
            "I'll be back",
            "Get out!",
            "I want your clothes, boots and motorcycle"
    };

    public String getText () {
        Random random = new Random();

        return texts[random.nextInt(texts.length)];
    }
}
