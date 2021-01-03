package com.wbq.patterns.singleton.lazy3;

/**
 * @ClassName Lazy3
 * @Description ����-����ʽ-�̰߳�ȫ-�Ż�
 * @Author wbq
 * @Date 2021/1/1 14:14
 * @Version 1.0
 */
public class Lazy3 {
    private static Lazy3 lazy3;

    private Lazy3() {
    }

    public static Lazy3 getInstance() {
        synchronized (Lazy3.class) {
            if (lazy3 == null) {
                lazy3 = new Lazy3();
            }
        }
        return lazy3;
    }

}
