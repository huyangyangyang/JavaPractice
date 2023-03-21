package com.hy.listdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("hy");
        list.add("zy");
        list.add("dd");
        list.add("huyang");
        System.out.println(list);

        list.remove("dd");
        System.out.println(list);

        System.out.println(list.remove(2));
        System.out.println(list);

        list.set(0,"huyang");
        System.out.println(list);

        System.out.println(list.get(1));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

    }
}
