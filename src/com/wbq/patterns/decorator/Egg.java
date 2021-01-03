package com.wbq.patterns.decorator;

/**
 * @ClassName Egg
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 16:27
 * @Version 1.0
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "¼¦µ°");
    }

    /***
     * µ°³´·¹µÄ¼Û¸ñ
     */
    @Override
    int cost() {
        return getPrice() + getFastFood().getPrice();
    }
}
