package com.wbq.patterns.singleton.lazy1;

/**
 * @ClassName Lazy
 * @Description ����-����ʽ
 * ����Ҫ��ʱ���ٵ��ò�������
 * @Author wbq
 * @Date 2021/1/1 13:55
 * @Version 1.0
 */
public class Lazy {
    private static Lazy lazy;

    private Lazy() {
    }

    public static Lazy getInstance() {
        if (lazy == null) {
            //�˴��̲߳���ȫ
            //�߳�1�ж�Ϊ�գ��߳�2Ҳ���е��˴����߳�1ִ�У����ɶ��󡣴�ʱ�߳�2��ִ�У����ɶ�����������������
            lazy = new Lazy();
        }
        return lazy;
    }
}
