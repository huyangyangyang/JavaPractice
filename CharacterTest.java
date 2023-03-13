package com.hy.practice.pdemo1;

public class CharacterTest {
    public static void main(String[] args) {
        Character c1 = new Character("乔峰", 100, 20);
        Character c2 = new Character("蔡徐坤", 100, 25);

       fight(c1,c2);

    }
    public static void fight(Character c1,Character c2){
        while(c1.getBloodVolume() > 0 && c2.getBloodVolume() > 0){
            c1.struck();
            c2.beStruck(c1.getATK());
            c2.struck();
            c1.beStruck(c2.getATK());
        }
        if(c1.getBloodVolume() > 0){
            System.out.println(c1.getName()+"胜！");
        }else {
            System.out.println(c2.getName()+"胜！");
        }
    }
}
