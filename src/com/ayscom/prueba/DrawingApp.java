package com.ayscom.prueba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wilder on 2/16/15.
 */
public class DrawingApp {

    public static void main (String[] args){

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.registerShutdownHook();
        Triangle  triangle = (Triangle) context.getBean("triangle1");

        triangle.draw();




    }
}
