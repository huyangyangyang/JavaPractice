package com.hy.test;

public class Student {
    private String name;
    private int age;

    public Student(){

    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        if(age >= 18 && age <= 40){
            this.age = age;
        }else{
            System.out.println("非法");
        }
    }
    public int getAge(){
        return this.age;
    }
}
