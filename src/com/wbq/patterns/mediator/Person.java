package com.wbq.patterns.mediator;

/**
 * @ClassName Person
 * @Description 中介者模式-房主和承租人抽象类
 * @Author wbq
 * @Date 2021/1/2 21:34
 * @Version 1.0
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
