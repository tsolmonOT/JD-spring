package com.cybertek.services;

import com.cybertek.interfaces.Course;

public class Java implements Course {
    OfficeHours officeHours;

    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
    //Java class is dependent on officeHours class
    //How we inject office hour obj into Java obj ?
    //Thru Constructor injection, Setter injection, Field injection


    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));
    }
}
