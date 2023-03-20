package com.hy.mystring.stringTest;

public class Test5 {
    public static void main(String[] args) {
        /* 给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串形式。
        注意：需要用已有的知识完成。*/

        //不需要考虑乘积过大之后的结果
        //就认为乘积一定是小于int的最大值的
        String num1 = "12345";
        String num2 = "12345";

        System.out.println(getStringToInt(num1)*getStringToInt(num2));

        //1.把num1和num2变成对应的整数才可以
        //"123456789"
        //先遍历字符串依次得到每一个字符 '1'  '2'  '3'  '4'  '5'  '6'  '7'  '8'  '9'
        //再把字符变成对应的数字即可     1    2    3     4    5    6    7    8    9
        //把每一个数字组合到一起 123456789

        //2.利用整数进行相乘


        //3.可以把整数变成字符串
        //+""
    }

    public static int getStringToInt(String s){
        double count = s.length()-1;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int num1 = c - 48;
            int num2 = (int)Math.pow(10,count);
            result = result + num1 * num2;
            count--;
        }
        return result;
    }
}
