package com.hy.practice.pdemo1;

public class Character {
    private String name;
    private int bloodVolume;
    private int ATK;


    public Character() {
    }


    public Character(String name, int bloodVolume, int ATK) {
        this.name = name;
        this.bloodVolume = bloodVolume;
        this.ATK = ATK;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return bloodVolume
     */
    public int getBloodVolume() {
        return bloodVolume;
    }

    /**
     * 设置
     * @param bloodVolume
     */
    public void setBloodVolume(int bloodVolume) {
        if(bloodVolume > 0) {
            this.bloodVolume = bloodVolume;
        }else
            System.out.println("血量异常");
    }

    public void struck(){
        System.out.print(this.name+"举起拳头打了");
    }


    public int beStruck(int ATK){
        int surplusBloodVolume = this.bloodVolume - ATK;
        System.out.print(this.name+"一下,造成了"+ATK+"点伤害,");
        if(surplusBloodVolume > 0){
            System.out.println(this.name+"还剩下"+surplusBloodVolume+"血。");
        }else
            System.out.println(this.name + "被KO了。");
        this.bloodVolume = surplusBloodVolume;
        return bloodVolume;
    }


    /**
     * 获取
     * @return ATK
     */
    public int getATK() {
        return ATK;
    }

    /**
     * 设置
     * @param ATK
     */
    public void setATK(int ATK) {
        this.ATK = ATK;
    }
}
