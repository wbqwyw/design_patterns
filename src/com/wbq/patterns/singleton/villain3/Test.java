package com.wbq.patterns.singleton.villain3;

import com.wbq.patterns.singleton.villain2.Villain2;

/**
 * @ClassName Test
 * @Description ≤‚ ‘¿‡
 * @Author wbq
 * @Date 2021/1/1 14:00
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Villain3 instance = Villain3.INSTANCE;
        Villain3 instance2 = Villain3.INSTANCE;
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance == instance2);
    }
}
