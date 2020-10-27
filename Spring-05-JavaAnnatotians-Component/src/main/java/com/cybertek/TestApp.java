package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        //Go to config xml and create all the beans in the container then call java beans and try to run method
        //No bean named 'java' available error
        //which annotation we need?
        //QComponent => this is replacement of bean id and class full path
        //@Controller => front end
        //@Service => business logic running
        //@Repository => User interface

        Course course = container.getBean("selenium", Course.class);
        course.getTeachingHours();

        //Default bean ids
        //if class name is Java ==> By default java ==>first letter is lower case
        //if the class name is all capital cases we need to pass bean id all capital cases
        Course course1 = container.getBean("API", Course.class);
        course1.getTeachingHours();
    }
}