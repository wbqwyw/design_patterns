package com.wbq.patterns.factory.itf;

/**
 * @ClassName ChinaImpl
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/1 19:41
 * @Version 1.0
 */
public class ChinaImpl implements InterfaceFactory {
    @Override
    public void print() {
        System.out.println("ÖÐ¹ú");
    }
}
