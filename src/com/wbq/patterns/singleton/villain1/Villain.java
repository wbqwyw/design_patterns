package com.wbq.patterns.singleton.villain1;

/**
 * @ClassName Villain
 * @Description 饿汉式-静态变量初始化
 * @Author wbq
 * @Date 2021/1/1 15:00
 * @Version 1.0
 */
public class Villain {
    private static Villain villain = new Villain();

    private Villain() {
    }

    public static Villain getInstance() {
        return villain;
    }
}
