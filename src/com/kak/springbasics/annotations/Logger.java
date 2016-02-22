package com.kak.springbasics.annotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by akak on 2/9/2016.
 */
public class Logger {
    //@Autowired
    private ConsoleWriter consoleWriter;
    //@Autowired
    private LogWriter fileWriter;
    private LogWriter backupWriter;

    public Logger () {

    }

    //@Autowired
    public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
        this.consoleWriter = consoleWriter;
        this.fileWriter = fileWriter;
    }

    @Autowired
    @Qualifier("toconsole")
    public void setConsoleWriter (ConsoleWriter writer) {
        this.consoleWriter = writer;
    }

    @Autowired
    @Qualifier("filewriter")
    public void setFileWriter (LogWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    @Resource(name="mongoose")
    public void setBackupWriter (LogWriter backupWriter) {
        this.backupWriter = backupWriter;
    }

    public void writeConsole (String text) {
        consoleWriter.write (text);
    }

    public void writeFile (String text) { fileWriter.write(text);}

    @PostConstruct
    public void init () {
        System.out.println("Logger Initialized");
    }

    @PreDestroy
    public void destroy () {
        System.out.println("Logger destroyed");
    }

}
