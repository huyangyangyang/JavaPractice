package com.hy.mystring.stringdemo;

import java.util.Scanner;

public class Stringdemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想要存储的金额:");
        int money = sc.nextInt();

        if(money < 0 || money > 9999999){
            System.out.println("金额无效");
        }

        String moneyStr = new String();

        while (true){
            int ge = money % 10;
            String capitalNum = getConversion(ge);
            moneyStr = capitalNum + moneyStr;
            money = money / 10;

            if(money == 0 ){
                break;
            }
        }

        for (int i = 0; i < 7; i++) {
            if(moneyStr.length() < 7){
                moneyStr = "零" + moneyStr;
            }
        }

        System.out.println(moneyStr);

        String[] arr = {"佰","拾","万","仟","佰","拾","元"};

        String result = new String();
        for (int i = 0; i < 7; i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }

        System.out.println(result);
    }

    public static String getConversion(int num){
        String[] arr = {"壹","贰","弎","肆","伍","陆","柒","捌","玖"};
        String s = arr[num-1];
        return s;
    }
}
