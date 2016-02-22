package com.kak.springbasics.data;

/**
 * Created by akak on 2/10/2016.
 */
public class Offer {
    private int id;
    private String text;
    private String username;

    public Offer () {

    }

    public Offer(String text, String username) {
        this.text = text;
        this.username = username;
    }

    public Offer(int id, String text, String username) {
        this.id = id;
        this.text = text;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
