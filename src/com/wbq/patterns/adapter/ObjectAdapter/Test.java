package com.wbq.patterns.adapter.ObjectAdapter;

import com.wbq.patterns.adapter.Computer;

/**
 * @ClassName Test
 * @Description 对象适配器
 * @Author wbq
 * @Date 2021/1/2 15:56
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.readCard(new ObjectAdapter(new TFCard()), "中美");
    }
}
