package com.wbq.patterns.factory.simple;

/**
 * @ClassName FactoryTest
 * @Description π§≥ß≤‚ ‘¿‡
 * @Author wbq
 * @Date 2021/1/1 19:36
 * @Version 1.0
 */
public class FactoryTest {
    public static void main(String[] args) {
        AbstractorFactory as = new America();
        AbstractorFactory ac = new China();
        as.print();
        ac.print();
    }
}
