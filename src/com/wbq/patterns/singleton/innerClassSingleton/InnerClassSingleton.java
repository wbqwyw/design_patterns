package com.wbq.patterns.singleton.innerClassSingleton;

/**
 * @program: design_patterns
 * @description: 内部类的方式实现单例
 * @author: Mr.Wang
 * @create: 2021-05-13 17:19
 **/
public class InnerClassSingleton {

    private InnerClassSingleton() {
    }

    private static class Singleton {
        public static final InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return Singleton.instance;
    }
}
