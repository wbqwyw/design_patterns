package com.wbq.patterns.singleton.villain2;

import com.wbq.patterns.singleton.villain1.Villain;

/**
 * @ClassName Test
 * @Description ≤‚ ‘¿‡
 * @Author wbq
 * @Date 2021/1/1 14:00
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Villain2 instance = Villain2.getInstance();
        Villain2 instance2 = Villain2.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance == instance2);
    }
}
