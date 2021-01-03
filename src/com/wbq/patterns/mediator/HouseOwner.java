package com.wbq.patterns.mediator;

/**
 * @ClassName HouseOwner
 * @Description �н���ģʽ-����
 * @Author wbq
 * @Date 2021/1/2 22:05
 * @Version 1.0
 */
public class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message) {
        mediator.contact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("����" + name + "��ȡ������Ϣ��" + message);
    }
}
