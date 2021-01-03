package com.wbq.patterns.Bridge;

/**
 * @ClassName Rmvb
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 17:03
 * @Version 1.0
 */
public class Rmvb implements VedioFile {
    @Override
    public void decode() {
        System.out.println("rmvb∏Ò Ω");
    }
}
