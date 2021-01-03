package com.wbq.patterns.singleton.lazy2;

/**
 * @ClassName Lazy2
 * @Description 单例-懒汉式-线程安全-方法加锁
 * @Author wbq
 * @Date 2021/1/1 14:02
 * @Version 1.0
 */
public class Lazy2 {
    private static Lazy2 lazy2;

    private Lazy2() {

    }

    /**
     * 加锁之后，每次读都要经过锁，其实可把读操作放在锁外面，提高性能
     */
    public static synchronized Lazy2 getInstance() {
        if (lazy2 == null) {
            //此时认为是写操作，只有一次
            lazy2 = new Lazy2();
        }
        //此处认为是读操作，每次都进行
        return lazy2;
    }
}
