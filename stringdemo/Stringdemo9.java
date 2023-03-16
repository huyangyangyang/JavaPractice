package com.hy.mystring.stringdemo;

public class Stringdemo9 {
    public static void main(String[] args) {
        String phoneNum = "13675152610";

        String start = phoneNum.substring(0,3);
        String end = phoneNum.substring(7);

        String result = start + "****" + end;
        System.out.println(result);
    }
}
