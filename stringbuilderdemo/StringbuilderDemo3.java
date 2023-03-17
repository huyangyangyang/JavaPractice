package com.hy.mystring.stringbuilderdemo;

public class StringbuilderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

        sb.append("hy").append("yu").append("zy");

        String s = sb.toString();

        System.out.println(sb);
        System.out.println(s);
    }
}
