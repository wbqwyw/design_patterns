package com.wbq.patterns.decorator;

/**
 * @ClassName FastFood
 * @Description ¿ì²Í
 * @Author wbq
 * @Date 2021/1/2 16:24
 * @Version 1.0
 */
public abstract class FastFood {
    private int price;
    private String desc;

    public FastFood(int price, String desc) {
        this.price = price;
        this.desc = desc;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    abstract int cost();
}
