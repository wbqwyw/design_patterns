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
        if (mes.equalsIgnoreCase("打开")) {
            on();
        } else if (mes.equalsIgnoreCase("关闭")) {
            off();
        } else {
            System.out.println("没有此功能");
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
