package com.wbq.patterns.decorator;

/**
 * @ClassName DecoratorTest
 * @Description װ����ģʽ����
 * @Author wbq
 * @Date 2021/1/2 16:38
 * @Version 1.0
 */
public class DecoratorTest {
    public static void main(String[] args) {
        FastFood rice = new Rice();
        System.out.println("������" + rice.cost() + "Ԫ");
        FastFood EggRice = new Egg(rice);
        System.out.println("��������" + EggRice.cost() + "Ԫ");
        FastFood baconRice = new Bacon(rice);
        System.out.println("���������" + baconRice.cost() + "Ԫ");
    }
}
