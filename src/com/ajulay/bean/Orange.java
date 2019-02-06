package com.ajulay.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("orange")
public class Orange implements Fruit{

    private String color;

    @PostConstruct
    public void init(){
        setColor("orange");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
