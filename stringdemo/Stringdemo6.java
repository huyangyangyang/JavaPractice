package com.hy.mystring.stringdemo;

public class Stringdemo6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        arrToString(arr);

    }

    public static void arrToString(int[] arr){
        String s = new String();
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(i == s.length()-1){
                System.out.print(c+"]");
            }else if (i == 0){
                System.out.print("["+c+",");
            }else
                System.out.print(c+",");
        }
    }
}
