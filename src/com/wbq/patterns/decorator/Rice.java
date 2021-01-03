package com.wbq.patterns.decorator;

/**
 * @ClassName Rice
 * @Description �׷�
 * @Author wbq
 * @Date 2021/1/2 16:26
 * @Version 1.0
 */
public class Rice extends FastFood {

    public Rice() {
        super(10, "����");
    }

    @Override
    int cost() {
        return getPrice();
    }
}
