package com.ayscom.prueba;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by wilder on 2/16/15.
 */
public class Circle implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    //@Resource("pointC")
    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }


    @Override
    public void draw() {
        System.out.println("Circle: Point is " +  getCenter());
    }


    @PostConstruct
    public void initializeCircle(){
        System.out.println("Init of Circle");
        }

    @PreDestroy
    public void destroyCircle(){
        System.out.println("Destruyelo destruyelo");
    }
}