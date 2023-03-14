package com.hy.practice.pdemo3;

public class 对象数组test1 {
    public static void main(String[] args) {
        Commodity carr[] = new Commodity[3];
        Commodity c1 = new Commodity(1,"可乐",3,100);
        Commodity c2 = new Commodity(2,"雪碧",3,100);
        Commodity c3 = new Commodity(3,"芬达",3,100);

        carr[0] = c1;
        carr[1] = c2;
        carr[2] = c3;

        for (int i = 0; i < carr.length; i++) {
            Commodity commoditys = carr[i];
            System.out.println(commoditys.getId()+","+commoditys.getName()+","+commoditys.getPrice()+","+commoditys.getInventory());
        }
    }

}
