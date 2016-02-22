package com.kak.springbasics.annotations;

/**
 * Created by akak on 2/9/2016.
 */
public class ConsoleWriter implements LogWriter {
    public ConsoleWriter () {

    }

    public void write (String text) {
        System.out.println (text);
    }
}
