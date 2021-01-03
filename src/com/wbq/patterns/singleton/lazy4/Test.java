package com.wbq.patterns.singleton.lazy4;

import com.wbq.patterns.singleton.lazy3.Lazy3;

/**
 * @ClassName Test
 * @Description ≤‚ ‘¿‡
 * @Author wbq
 * @Date 2021/1/1 14:00
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Lazy4 instance = Lazy4.getInstance();
        Lazy4 instance2 = Lazy4.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance == instance2);
    }
}
