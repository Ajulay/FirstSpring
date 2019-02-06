package com.ajulay;

import com.ajulay.bean.Apple;
import com.ajulay.bean.Fruit;
import com.ajulay.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Apple apple = ctx.getBean("apple", Apple.class);
        Fruit orange = (Fruit) ctx.getBean("orange");
        System.out.println("Conclusion: ");
        System.out.println(apple.getColor());
        System.out.println(orange.getColor());
    }

}
