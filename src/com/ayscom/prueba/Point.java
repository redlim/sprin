package com.ayscom.prueba;

/**
 * Created by wilder on 2/16/15.
 */
public class Point {

    private int y;
    private int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }



    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString(){
        return ("(" + x + "," + y + ")");
    }



}
