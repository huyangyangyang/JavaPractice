package com.hy.test;

import javafx.beans.binding.StringExpression;

public class User {
    private String name;
    private String password;
    private String email;
    private String gender;
    private int age;

    //快捷键 alt+fn+insert
    //插件 PTG
    public User(){
    }
    public User(String name, String password, String email, String gender,int age){
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender =gender;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }

    public void setEmail(String email){
        this.name = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return this.gender;
    }

    public void setAge(int age){
        if(age >= 0 && age <= 100){
            this.age = age;
        }else
            System.out.println("非法年龄");
    }
    public int getAge(){
        return this.age;
    }
}
