package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mobile {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // Get the bean
        Sim sim = context.getBean("sim", Sim.class);

        // Calling the methods
        sim.calling();
        sim.data();
    }
}
