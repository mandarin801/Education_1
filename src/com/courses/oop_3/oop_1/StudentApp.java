package com.courses.oop_3.oop_1;

import org.hibernate.annotations.SourceType;

/**
 * Created by Vladimir Sulevskiy on 30.06.2015.
 */
public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Ivanov");
        System.out.println(student1);
    }
    
}
