package com.hy.practice.pdemo3;

public class Commodity {
    private int id;
    private String name;
    private int price;
    private int inventory;

    public Commodity() {
    }

    public Commodity(int id, String name, int price, int inventory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inventory = inventory;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 获取
     * @return inventory
     */
    public int getInventory() {
        return inventory;
    }

    /**
     * 设置
     * @param inventory
     */
    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String toString() {
        return "Commodity{id = " + id + ", name = " + name + ", price = " + price + ", inventory = " + inventory + "}";
    }
}
