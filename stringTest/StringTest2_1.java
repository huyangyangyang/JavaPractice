package com.hy.mystring.stringTest;

import java.util.Scanner;

public class StringTest2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(returnResult(s1,s2));
    }

    public static String changeStr(String s){
//        StringBuilder sb =new StringBuilder();
//        for (int i = 1; i < s.length(); i++) {
//            char c = s.charAt(i);
//            sb.append(c);
//        }
//        return sb.append(s.charAt(0)).toString();

        char first = s.charAt(0);
        String end = s.substring(1);
        return end + first;
    }

    public static boolean returnResult(String s1,String s2){
        for (int i = 0; i < s1.length() - 1; i++) {
            s1 = changeStr(s1);
            if(s1.equals(s2)){
                return true;
            }
        }
        return false;
    }
}
