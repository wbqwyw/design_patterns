package com.wbq.patterns.adapter;

/**
 * @ClassName CardAdapter
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 15:43
 * @Version 1.0
 */
public class CardAdapter extends SfCardImpl implements Sdcard {

    @Override
    public void read(String s) {
        System.out.println("Œ“ «  ≈‰∆˜£∫" + s);
    }
}
