package com.hy.test;

public class PhoneTest {
    public static void main(String[] args) {
        //创建对象
        Phone p1 = new Phone();

        p1.brand = "华为";
        p1.price = 8888.88;

        System.out.println(p1.brand);
        System.out.println(p1.price);

        p1.call();
        p1.playGame();
    }
}
