package com.wbq.patterns.singleton.villain2;

import com.sun.org.apache.bcel.internal.generic.ATHROW;

/**
 * @ClassName Villain2
 * @Description 饿汉式-静态代码块初始化
 * @Author wbq
 * @Date 2021/1/1 17:22
 * @Version 1.0
 */
public class Villain2 {
    private static Villain2 villain2;

    static {
        villain2 = new Villain2();
    }

    private Villain2() {
        if (villain2 != null) {
            throw new RuntimeException("不能重复获取");
        }
    }

    public static Villain2 getInstance() {
        return villain2;
    }
}
