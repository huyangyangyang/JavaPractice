package com.hy.mystring.stringbuilderdemo;

import java.util.Scanner;

public class StringbuilderDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output = new StringBuilder(input).reverse().toString();


        if(input.equals(output)){
            System.out.println("是对称字符串！");
        }else {
            System.out.println("不是对称字符串！");
        }

    }
}
