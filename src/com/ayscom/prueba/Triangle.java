package com.ayscom.prueba;

import java.util.List;

/**
 * Created by wilder on 2/16/15.
 */
public class Triangle {


    private List<Point> pointLists;

    public List<Point> getPointLists() {
        return pointLists;
    }

    public void setPointLists(List<Point> pointLists) {
        this.pointLists = pointLists;
    }
;

    private Point pointA;
    private Point pointB;
    private Point pointC;
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


    public void draw(){

        for(Point point : pointLists )
        System.out.println("Point: " + point);
        System.out.println( "Point A " + getPointA() + ", point B " + getPointB() + ", Point C : " + getPointC());
    }
}


