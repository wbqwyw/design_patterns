package com.wbq.patterns.decorator;

/**
 * @ClassName DecoratorTest
 * @Description 装饰着模式测试
 * @Author wbq
 * @Date 2021/1/2 16:38
 * @Version 1.0
 */
public class DecoratorTest {
    public static void main(String[] args) {
        FastFood rice = new Rice();
        System.out.println("炒饭：" + rice.cost() + "元");
        FastFood EggRice = new Egg(rice);
        System.out.println("蛋炒饭：" + EggRice.cost() + "元");
        FastFood baconRice = new Bacon(rice);
        System.out.println("培根炒饭：" + baconRice.cost() + "元");
    }
}
