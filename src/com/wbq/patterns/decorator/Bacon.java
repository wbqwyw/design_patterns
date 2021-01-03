package com.wbq.patterns.decorator;

/**
 * @ClassName Bacon
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 16:42
 * @Version 1.0
 */
public class Bacon extends FastFood {
    public FastFood fastFood;

    public Bacon(FastFood fastFood) {
        super(2, "Åà¸ù");
        this.fastFood = fastFood;
    }

    @Override
    int cost() {
        return getPrice() + fastFood.getPrice();
    }
}
