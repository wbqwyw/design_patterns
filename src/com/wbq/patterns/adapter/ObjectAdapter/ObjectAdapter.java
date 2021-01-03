package com.wbq.patterns.adapter.ObjectAdapter;

import com.wbq.patterns.adapter.Sdcard;

/**
 * @ClassName ObjectAdapter
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 15:55
 * @Version 1.0
 */
public class ObjectAdapter implements Sdcard {
    private TFCard tfCard;

    public ObjectAdapter(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public void read(String s) {
        System.out.println("∂‘œÛ  ≈‰∆˜");
        tfCard.tfCard();
    }
}
