package com.hy.mystring.stringjoinerdemo;

import java.util.StringJoiner;

public class StringjoinerDemo2 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","]");

        int[] arr = {1,2,3};

        for (int i = 0; i < arr.length; i++) {
            String s = Integer.toString(arr[i]);
            //String s = String.valueOf(arr[i]);
            sj.add(s);
        }

        String s = sj.toString();
        System.out.println(s);
    }
}
