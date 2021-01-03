package com.wbq.patterns.singleton.lazy2;

import com.wbq.patterns.singleton.lazy1.Lazy;

/**
 * @ClassName Test
 * @Description ≤‚ ‘¿‡
 * @Author wbq
 * @Date 2021/1/1 14:00
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Lazy2 instance = Lazy2.getInstance();
        Lazy2 instance2 = Lazy2.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance == instance2);
    }
}
