package com.ajulay.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Basket {

    @Autowired
    private Fruit apple;

    @Autowired
    private Fruit orange;

    @PostConstruct
    public void init(){
        System.out.println("Basket is full.");
        System.out.println(apple.getColor());
        System.out.println(orange.getColor());
    }

    public Fruit getApple() {
        return apple;
    }

    public void setApple(Fruit apple) {
        this.apple = apple;
    }

    public Fruit getOrange() {
        return orange;
    }

    public void setOrange(Fruit orange) {
        this.orange = orange;
    }
}
