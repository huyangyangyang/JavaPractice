package com.hy.practice.pdemo4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        girlFriend[] arr = new girlFriend[3];
        int sumAge = 0;
        int avg = 0;

        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            girlFriend girlFriend = new girlFriend(sc.next(),sc.nextInt(),sc.nextInt());
            arr[i] = girlFriend;
            sumAge += girlFriend.getAge();
        }
        avg = sumAge/arr.length;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge() < avg){
                System.out.println(arr[i].getAge()+" "+arr[i].getName()+" "+arr[i].getHeight());
            }
        }
    }
}
