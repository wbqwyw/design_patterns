package com.wbq.patterns.adapter;

/**
 * @ClassName Test
 * @Description 类适配器测试
 * @Author wbq
 * @Date 2021/1/2 15:45
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        CardAdapter cardAdapter = new CardAdapter();
        //这样使得，computer也能读取sf卡的内容了
        computer.readCard(cardAdapter, "ss");
    }
}
