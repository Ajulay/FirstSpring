package com.ajulay.configuration;

import com.ajulay.bean.Apple;
import com.ajulay.bean.Fruit;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        if(bean instanceof Apple){
            Fruit fruit = (Fruit)bean;
            // fruit.setColor("sea");
            System.out.println(fruit.getColor() + " before");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String s) throws BeansException {
       if(bean instanceof Apple){
        Fruit fruit = (Fruit)bean;
        fruit.setColor("orange color");
        System.out.println(fruit.getColor() + " after");
           }
        return bean;
    }
}
