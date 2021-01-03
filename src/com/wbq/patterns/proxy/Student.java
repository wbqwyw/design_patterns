package com.wbq.patterns.proxy;

/**
 * @ClassName Student
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 12:06
 * @Version 1.0
 */
public class Student implements Man {
    @Override
    public void print(String name) {
        System.out.println("ÖÐ¹ú£º" + name);
    }
}
