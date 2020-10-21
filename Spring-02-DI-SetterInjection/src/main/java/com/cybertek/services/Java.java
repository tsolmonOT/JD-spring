package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

public class Java implements Course {
//    OfficeHours officeHours;
//
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }
    //Injection is needed whenever class is depends on other class exp:
    //Java class is dependent on officeHours class
    //How we inject office hour obj into Java obj ?
    //Thru Constructor injection, Setter injection, Field injection


    //Code is more efficient this way because of loose coupling
    //Always do your injection thru interfaces!!!

    ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {
     //   System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));
        System.out.println("Weekly teaching hours : " + (20 + extraSessions.getHours()));
    }
}
