package com.wbq.patterns.singleton.lazy4;

import java.io.Serializable;

/**
 * @ClassName Lazy4
 * @Description 单例-懒汉式-静态内部类
 * 序列化机制可以破坏单例模式
 * 可以查看ObjectInputStream.readObject方法
 * 原因是这个方法中他会使用反射机制，调用newInStance方法产生新的对象
 * 解决办法：
 * 实现
 * @Author wbq
 * @Date 2021/1/1 14:20
 * @Version 1.0
 */
public class Lazy4 implements Serializable {
    private static Lazy4 lazy4;

    private Lazy4() {
    }

    private static class SingleLazy4 {
        public static final Lazy4 LAZY4 = new Lazy4();
    }

    public static Lazy4 getInstance() {
        return SingleLazy4.LAZY4;
    }

    private Object readResolve() {
        //两种方式都行，主要是初始化
//        return getInstance();
        return SingleLazy4.LAZY4;
    }
}
