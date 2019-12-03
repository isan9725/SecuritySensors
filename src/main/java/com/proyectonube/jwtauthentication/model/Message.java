package com.proyectonube.jwtauthentication.model;

public class Message{

    private String text;

    private String icon;


    public Message() {
    }

    public Message(String text, String icon) {
        this.text = text;
        this.icon = icon;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Message text(String text) {
        this.text = text;
        return this;
    }

    public Message icon(String icon) {
        this.icon = icon;
        return this;
    }
}