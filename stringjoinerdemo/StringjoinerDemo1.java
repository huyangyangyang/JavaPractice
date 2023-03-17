package com.hy.mystring.stringjoinerdemo;

import java.util.StringJoiner;

public class StringjoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("---");
        sj.add("aaa").add("hy").add("zy");
        System.out.println(sj);
    }
}
