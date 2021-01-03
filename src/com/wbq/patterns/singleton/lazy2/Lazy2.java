package com.wbq.patterns.singleton.lazy2;

/**
 * @ClassName Lazy2
 * @Description ����-����ʽ-�̰߳�ȫ-��������
 * @Author wbq
 * @Date 2021/1/1 14:02
 * @Version 1.0
 */
public class Lazy2 {
    private static Lazy2 lazy2;

    private Lazy2() {

    }

    /**
     * ����֮��ÿ�ζ���Ҫ����������ʵ�ɰѶ��������������棬�������
     */
    public static synchronized Lazy2 getInstance() {
        if (lazy2 == null) {
            //��ʱ��Ϊ��д������ֻ��һ��
            lazy2 = new Lazy2();
        }
        //�˴���Ϊ�Ƕ�������ÿ�ζ�����
        return lazy2;
    }
}
