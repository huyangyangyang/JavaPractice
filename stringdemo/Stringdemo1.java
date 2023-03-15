package com.hy.mystring.stringdemo;

public class Stringdemo1 {
    public static void main(String[] args) {
        String s1 = "zy";
        System.out.println(s1);

        String s2 = new String();
        System.out.println("@"+s2+"hy");

        String s3 = new String("abc");
        System.out.println(s3);

//      更改字符串里面个别字词
        char[] chs = {'a','b','c'};
        String s4 = new String(chs);
        System.out.println(s4);

//      字节数组asc码
        byte[] bytes = {97,98,99};
        String s5 = new String(bytes);
        System.out.println(s5);
    }
}
