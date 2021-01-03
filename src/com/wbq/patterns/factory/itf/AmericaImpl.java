package com.wbq.patterns.factory.itf;

/**
 * @ClassName AmericaImpl
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/1 19:41
 * @Version 1.0
 */
public class AmericaImpl implements InterfaceFactory {
    @Override
    public void print() {
        System.out.println("ÃÀ¹ú");
    }
}
