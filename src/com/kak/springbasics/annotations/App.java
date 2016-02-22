package com.kak.springbasics.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by akak on 2/9/2016.
 */
public class App {

    public static void main (String[] args) {
        ApplicationContext context;

        context = new FileSystemXmlApplicationContext("src\\com\\kak\\springbasics\\beans\\beans.xml");

        Logger logger = (Logger) context.getBean ("logger");
        logger.writeConsole ("This is a console test");
        logger.writeFile ("This is a file test");

        ((FileSystemXmlApplicationContext) context).close();
    }
}
