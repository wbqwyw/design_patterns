package com.wbq.patterns.singleton.lazy5;

import com.wbq.patterns.singleton.lazy1.Lazy;

/**
 * @ClassName lazy5
 * @Description 懒汉-双重检查
 * @Author wbq
 * @Date 2021/1/1 14:27
 * @Version 1.0
 */
public class Lazy5 {
    /**
     * JVM在实例化对象的时候会进行优化和指令重排序操作
     * 在多线程的情况下，可能会出现空指针问题
     * 多线程情况下，有的线程可能拿到的是null，原因是这个lazy5变量，不能保证共享
     * volatile：
     * 可见性:保证变量lazy5是共享的
     * 有序性：禁止指令重排序，所以保证是有序
     */
    private static volatile Lazy5 lazy5;

    private Lazy5() {
    }

    public static Lazy5 getInstance() {
        if (lazy5 == null) {
            synchronized (Lazy5.class) {
                if (lazy5 == null) {
                    lazy5 = new Lazy5();
                }
            }
        }
        return lazy5;
    }
}
