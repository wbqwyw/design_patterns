package com.wbq.patterns.singleton.lazy1;

/**
 * @ClassName Lazy
 * @Description 单例-懒汉式
 * 当需要的时候再调用产生对象
 * @Author wbq
 * @Date 2021/1/1 13:55
 * @Version 1.0
 */
public class Lazy {
    private static Lazy lazy;

    private Lazy() {
    }

    public static Lazy getInstance() {
        if (lazy == null) {
            //此处线程不安全
            //线程1判断为空，线程2也运行到此处，线程1执行，生成对象。此时线程2又执行，生成对象。则生成两个对象
            lazy = new Lazy();
        }
        return lazy;
    }
}
