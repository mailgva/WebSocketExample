package com.gorbatenko.websocket;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @JsonCreator
    public Greeting(@JsonProperty("text") String text) {
        this.text = text;
    }
}
