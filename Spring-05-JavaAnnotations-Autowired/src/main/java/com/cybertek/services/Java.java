package com.cybertek.services;

import com.cybertek.interfaces.Course;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    //Field injection
    @Autowired
    private OfficeHours officeHours;

    //Constructor injection => if you have only 1 constructor @Autowired is optional
//    @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    //Setter injection
    //Annotation is required bc there is multiple setters
//    @Autowired
//    public void setOfficeHours(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " +(30+officeHours.getHours()));
    }
}
