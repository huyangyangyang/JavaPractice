package com.hy.mystring.stringdemo;

import java.util.Scanner;

public class Stringdemo4 {
    public static void main(String[] args) {
        String username = "hy";
        String password = "Huyang0407";

        Scanner sc =new Scanner(System.in);
        int count = 3;
        //3.fori
        for(int i = 0;i < 3;i++){
            count--;
            String s1 = sc.next();
            String s2 = sc.next();
            if(s1.equals((username)) && s2.equals(password)){
                System.out.println("登录成功");
            }else {
                if(count>0){
                    System.out.println("用户名或密码错误请重新输入！你还有"+count+"次机会!");
                }else {
                    System.out.println("你的账户被冻结了！");
                }
            }
        }
    }
}
