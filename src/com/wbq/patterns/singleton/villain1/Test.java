package com.wbq.patterns.singleton.villain1;

import com.wbq.patterns.singleton.lazy5.Lazy5;

/**
 * @ClassName Test
 * @Description ≤‚ ‘¿‡
 * @Author wbq
 * @Date 2021/1/1 14:00
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Villain instance = Villain.getInstance();
        Villain instance2 = Villain.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance == instance2);
    }
}
