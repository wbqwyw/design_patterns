package com.wbq.patterns.singleton.villain3;

/**
 * @author wbq
 * @Description 饿汉式-枚举类-推荐使用的单例
 * 特点：线程安全、不影响性能、可以序列化反序列化及反射
 * 缺点：可能空间占用浪费
 */

public enum Villain3 {
    INSTANCE;
}
