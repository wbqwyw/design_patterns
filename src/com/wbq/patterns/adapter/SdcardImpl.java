package com.wbq.patterns.adapter;

/**
 * @ClassName SdcardImpl
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 15:37
 * @Version 1.0
 */
public class SdcardImpl implements Sdcard {
    @Override
    public void read(String s) {
        System.out.println("我是sdcard的实现：" + s);
    }
}
