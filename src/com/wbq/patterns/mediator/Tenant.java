package com.wbq.patterns.mediator;

/**
 * @ClassName Tenant
 * @Description �н���ģʽ-������
 * @Author wbq
 * @Date 2021/1/2 21:37
 * @Version 1.0
 */
public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message) {
        mediator.contact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("�ⷿ��" + name + "��ȡ������Ϣ��" + message);
    }
}
