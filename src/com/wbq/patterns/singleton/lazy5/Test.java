package com.wbq.patterns.singleton.lazy5;

import com.wbq.patterns.singleton.lazy4.Lazy4;

/**
 * @ClassName Test
 * @Description ≤‚ ‘¿‡
 * @Author wbq
 * @Date 2021/1/1 14:00
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Lazy5 instance = Lazy5.getInstance();
        Lazy5 instance2 = Lazy5.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance == instance2);
    }
}
