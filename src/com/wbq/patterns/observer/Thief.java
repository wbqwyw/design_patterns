package com.wbq.patterns.observer;

import java.util.Observable;

/**
 * @ClassName Thief
 * @Description ���۲���-С͵
 * @Author wbq
 * @Date 2021/1/2 21:07
 * @Version 1.0
 */
public class Thief extends Observable {
    private String name;

    public Thief(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void steal() {
        System.out.println("��ʼ͵����");
        super.setChanged();
        super.notifyObservers();
    }
}
