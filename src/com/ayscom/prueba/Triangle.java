package com.ayscom.prueba;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

/**
 * Created by wilder on 2/16/15.
 */
public class Triangle implements InitializingBean, DisposableBean, Shape {

    private List<Point> pointLists;

    public List<Point> getPointLists() {
        return pointLists;
    }

    public void setPointLists(List<Point> pointLists) {
        this.pointLists = pointLists;
    }

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context= null;
    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public void draw(){
        System.out.println("Triangle:");
        for(Point point : pointLists )
        System.out.println("Point: " + point);
      //  System.out.println( "Point A " + getPointA() + ", point B " + getPointB() + ", Point C : " + getPointC());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean in Triangle");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy in bean");
    }

    public void miInit(){
        System.out.println("Initial triangle");
    }

    public void miEnd(){
        System.out.println("Fin triangle");
    }
}


