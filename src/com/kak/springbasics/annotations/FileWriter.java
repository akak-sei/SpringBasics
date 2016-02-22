package com.kak.springbasics.annotations;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by akak on 2/9/2016.
 */
@Qualifier("filewriter")
public class FileWriter implements LogWriter {
    public FileWriter () {

    }

    public void write (String text) {
        System.out.println (text);
    }
}
