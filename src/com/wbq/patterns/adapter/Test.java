package com.wbq.patterns.adapter;

/**
 * @ClassName Test
 * @Description ������������
 * @Author wbq
 * @Date 2021/1/2 15:45
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        CardAdapter cardAdapter = new CardAdapter();
        //����ʹ�ã�computerҲ�ܶ�ȡsf����������
        computer.readCard(cardAdapter, "ss");
    }
}
