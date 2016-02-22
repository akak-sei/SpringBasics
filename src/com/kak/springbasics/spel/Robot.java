package com.kak.springbasics.spel;

/**
 * Created by akak on 2/9/2016.
 */
public class Robot {
    private String id = "Default robot";
    private String secretName;
    private String speech = "Default hello";
    private String dbUser;
    private String dbPassword;

    public void speak () {
        System.out.println (id +": " +speech);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSecretName (String secretName) {
        this.secretName = secretName;
    }

    public String getSecretName () {
        return secretName;
    }

    public void setSpeech (String speech) {
        this.speech = speech;
    }

    public void setDbUser (String dbUser) {
        this.dbUser = dbUser;
    }

    public void setDbPassword (String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public void revealDBCredentials () {
        System.out.println ("User: " +dbUser +", Password: " +dbPassword);
    }
}
