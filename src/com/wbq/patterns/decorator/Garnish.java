package com.wbq.patterns.decorator;

/**
 * @ClassName Garnish
 * @Description ≈‰¡œ
 * @Author wbq
 * @Date 2021/1/2 16:31
 * @Version 1.0
 */
public abstract class Garnish extends FastFood {
    private FastFood fastFood;

    public Garnish(FastFood fastFood, int price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
