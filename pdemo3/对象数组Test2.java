package com.hy.practice.pdemo3;

import java.util.Scanner;

public class 对象数组Test2 {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入汽车的品牌，颜色，价格：");
            Car cars = new Car(sc.next(), sc.next(), sc.nextInt());
            arr[i] = cars;
            System.out.println(cars.getBrand()+","+cars.getPrice()+","+cars.getColor());
        }
    }
}

