package com.hy.mystring.stringTest;

import java.util.Scanner;

public class StringTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(checkStr(s)){
            System.out.println("非法输入.");
        }else {
            StringBuilder sb =new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int num = c - 48;
                if(num == 0){
                    sb.delete(0,i);
                    break;
                }else {
                    sb.append(numToRomanNum(num));
                }
            }

            String result = sb.toString();
            System.out.println(result);
        }
    }

    public static String numToRomanNum(int num){
        String[] arr = {"Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};

        return arr[num-1];
    }

    public static boolean checkStr(String s){
        if(s.length() > 9){
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c < '0' || c > '9'){
                return true;
            }
        }

        return false;
    }
}
