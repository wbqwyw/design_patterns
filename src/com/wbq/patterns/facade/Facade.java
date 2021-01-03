package com.wbq.patterns.facade;

/**
 * @ClassName Facade
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 17:46
 * @Version 1.0
 */
public class Facade {
    private Tv tv;
    private Light light;

    public Facade() {
        this.tv = new Tv();
        this.light = new Light();
    }

    public void say(String mes) {
        if (mes.equalsIgnoreCase("��")) {
            on();
        } else if (mes.equalsIgnoreCase("�ر�")) {
            off();
        } else {
            System.out.println("û�д˹���");
        }
    }

    public void on() {
        tv.on();
        light.on();
    }

    public void off() {
        tv.off();
        light.off();
    }

}
