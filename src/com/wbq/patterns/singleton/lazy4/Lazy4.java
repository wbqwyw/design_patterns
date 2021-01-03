package com.wbq.patterns.singleton.lazy4;

import java.io.Serializable;

/**
 * @ClassName Lazy4
 * @Description ����-����ʽ-��̬�ڲ���
 * ���л����ƿ����ƻ�����ģʽ
 * ���Բ鿴ObjectInputStream.readObject����
 * ԭ�����������������ʹ�÷�����ƣ�����newInStance���������µĶ���
 * ����취��
 * ʵ��
 * @Author wbq
 * @Date 2021/1/1 14:20
 * @Version 1.0
 */
public class Lazy4 implements Serializable {
    private static Lazy4 lazy4;

    private Lazy4() {
    }

    private static class SingleLazy4 {
        public static final Lazy4 LAZY4 = new Lazy4();
    }

    public static Lazy4 getInstance() {
        return SingleLazy4.LAZY4;
    }

    private Object readResolve() {
        //���ַ�ʽ���У���Ҫ�ǳ�ʼ��
//        return getInstance();
        return SingleLazy4.LAZY4;
    }
}
