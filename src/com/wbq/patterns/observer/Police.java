package com.wbq.patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName Police
 * @Description �۲���-����
 * @Author wbq
 * @Date 2021/1/2 21:10
 * @Version 1.0
 */
public class Police implements Observer {
    private String name;

    public Police(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("����:������...." + ((Thief) o).getName() + ",��������è����ץ������....");
    }
}
