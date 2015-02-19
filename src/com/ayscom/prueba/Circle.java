package com.ayscom.prueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by wilder on 2/16/15.
 */
@Controller
public class Circle implements Shape, ApplicationEventPublisherAware {
    private Point center;
    @Autowired
    private MessageSource messageSource;
    private ApplicationEventPublisher publisher;

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
        System.out.println(this.messageSource.getMessage("drawing.circle",null,"Vaya por defeto",null));
        System.out.println(this.messageSource.getMessage("drawing.point",new Object[] {getCenter()},"Vaya por defeto",null));
        System.out.println(this.messageSource.getMessage("greeting",null,"Vaya por defeto",null));
        DrawEvent drawEvent = new DrawEvent(this);
        publisher.publishEvent(drawEvent);

    }


    @PostConstruct
    public void initializeCircle(){
        System.out.println("Init of Circle");
        }

    @PreDestroy
    public void destroyCircle(){
        System.out.println("Destruyelo destruyelo");
    }

    public void setMessageSource(MessageSource messageSource){
        this.messageSource = messageSource;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
            publisher = applicationEventPublisher;
    }
}