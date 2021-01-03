package com.wbq.patterns.singleton.lazy5;

import com.wbq.patterns.singleton.lazy1.Lazy;

/**
 * @ClassName lazy5
 * @Description ����-˫�ؼ��
 * @Author wbq
 * @Date 2021/1/1 14:27
 * @Version 1.0
 */
public class Lazy5 {
    /**
     * JVM��ʵ���������ʱ�������Ż���ָ�����������
     * �ڶ��̵߳�����£����ܻ���ֿ�ָ������
     * ���߳�����£��е��߳̿����õ�����null��ԭ�������lazy5���������ܱ�֤����
     * volatile��
     * �ɼ���:��֤����lazy5�ǹ����
     * �����ԣ���ָֹ�����������Ա�֤������
     */
    private static volatile Lazy5 lazy5;

    private Lazy5() {
    }

    public static Lazy5 getInstance() {
        if (lazy5 == null) {
            synchronized (Lazy5.class) {
                if (lazy5 == null) {
                    lazy5 = new Lazy5();
                }
            }
        }
        return lazy5;
    }
}
