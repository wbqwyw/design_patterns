package com.wbq.patterns.singleton.lazy3;

import com.wbq.patterns.singleton.lazy2.Lazy2;

/**
 * @ClassName Test
 * @Description ≤‚ ‘¿‡
 * @Author wbq
 * @Date 2021/1/1 14:00
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Lazy3 instance = Lazy3.getInstance();
        Lazy3 instance2 = Lazy3.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance == instance2);
    }
}
