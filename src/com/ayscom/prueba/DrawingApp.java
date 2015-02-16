package com.ayscom.prueba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wilder on 2/16/15.
 */
public class DrawingApp {

    public static void main (String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Triangle  triangle = (Triangle) context.getBean("triangle-alias");

        triangle.draw();




    }
}
