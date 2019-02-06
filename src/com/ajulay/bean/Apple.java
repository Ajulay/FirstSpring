package com.ajulay.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("apple")
@PropertySource("App.properties")
public class Apple implements Fruit{

    @Value("${color}")
    private String color;

    @PostConstruct
    public void init(){
        System.out.println("apple construct");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
