package com.cybertek.services;

import com.cybertek.interfaces.Course;
import lombok.Data;

@Data

public class Java implements Course {

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " +20);
    }

    public void myInitMethod(){
        System.out.println("Executing init method");
    }

    public void myDestroyMethod(){
        System.out.println("Executing destroy method");
    }
}
