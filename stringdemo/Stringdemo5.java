package com.hy.mystring.stringdemo;

import java.util.Scanner;

public class Stringdemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();

        int bigCount = 0;
        int smallCount = 0 ;
        int numCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z'){
                smallCount++;
            }else if (c >= 'A' && c <= 'Z'){
                bigCount++;
            }else if (c >= '0' && c <= '9'){
                numCount++;
            }
        }

        System.out.println("小写字母一共有"+smallCount+"个。");
        System.out.println("大写字母一共有"+bigCount+"个。");
        System.out.println("数字一共有"+numCount+"个。");
    }
}
