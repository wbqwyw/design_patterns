package com.wbq.patterns.mediator;

/**
 * @ClassName Person
 * @Description �н���ģʽ-�����ͳ����˳�����
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
