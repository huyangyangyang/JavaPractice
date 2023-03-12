package com.hy.test;

import java.sql.SQLOutput;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("hy",24);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());

        Student s2 = new Student();
        s2.setName("zy");
        System.out.println(s2.getName());
    }

}
