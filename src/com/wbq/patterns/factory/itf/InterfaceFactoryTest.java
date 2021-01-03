package com.wbq.patterns.factory.itf;

/**
 * @ClassName InterfaceFactoryTest
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/1 19:42
 * @Version 1.0
 */
public class InterfaceFactoryTest {
    public static void main(String[] args) {
        InterfaceFactory ac = new AmericaImpl();
        InterfaceFactory ch = new ChinaImpl();
        ac.print();
        ch.print();
    }
}
