package com.ayscom.prueba;

import org.springframework.context.ApplicationEvent;

/**
 * Created by wilder on 2/19/15.
 */
public class DrawEvent extends ApplicationEvent {


    public DrawEvent(Object source) {
        super(source);
    }

    @Override
    public String toString(){
        return "Has dibujado algo eh";
    }
}
