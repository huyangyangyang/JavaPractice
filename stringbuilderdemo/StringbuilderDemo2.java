package com.hy.mystring.stringbuilderdemo;

public class StringbuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");

        System.out.println(sb);

        String s = sb.toString();
        System.out.println(s);
    }
}
