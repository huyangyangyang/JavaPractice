package com.hy.mystring.stringdemo;

public class Stringdemo10 {
    public static void main(String[] args) {
        String idNum = "320826200004070013";

        String birthday = idNum.substring(6,10) + "年" +idNum.substring(10,12) + "月" + idNum.substring(12,14) + "日";
        String sex = idNum.substring(16,17);

        System.out.println("人物信息为：");
        System.out.println("出生年月日为：" + birthday);
        if (sex.equals("1") || sex.equals("3") || sex.equals("5") || sex.equals("7") || sex.equals("9")){
            System.out.println("性别为男");
        }else {
            System.out.println("性别为女");
        }


    }
}
