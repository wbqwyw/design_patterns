package com.wbq.patterns.observer;

/**
 * @ClassName Test
 * @Description 观察者模式测试
 * @Author wbq
 * @Date 2021/1/2 21:14
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Thief thief = new Thief("梁上草-石阡");
        Police police = new Police("展昭");
        thief.addObserver(police);
        thief.steal();
    }
}
