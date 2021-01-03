package com.wbq.patterns.adapter;

/**
 * @ClassName Computer
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 15:38
 * @Version 1.0
 */
public class Computer {
    public void readCard(Sdcard sdcard, String s) {
        sdcard.read(s);
    }
}
