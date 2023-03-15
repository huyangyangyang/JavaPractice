package com.hy.mystring.stringdemo;

public class Stringdemo7 {
    public static void main(String[] args) {
        String s = "abc";

        System.out.print(getReverse(s));

    }

    public static String getReverse(String s){
        String string = new String();
        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            string += c;
        }
        return string;

    }
}
