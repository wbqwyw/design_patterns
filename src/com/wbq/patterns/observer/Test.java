package com.wbq.patterns.observer;

/**
 * @ClassName Test
 * @Description �۲���ģʽ����
 * @Author wbq
 * @Date 2021/1/2 21:14
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Thief thief = new Thief("���ϲ�-ʯ��");
        Police police = new Police("չ��");
        thief.addObserver(police);
        thief.steal();
    }
}
