package com.wbq.patterns.mediator;

/**
 * @ClassName Mediator
 * @Description 中介者模式-中介
 * @Author wbq
 * @Date 2021/1/2 21:33
 * @Version 1.0
 */
public abstract class Mediator {
    public abstract void contact(String message, Person person);
}
