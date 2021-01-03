package com.wbq.patterns.Bridge;

/**
 * @ClassName MacSystem
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 17:07
 * @Version 1.0
 */
public class MacSystem extends OsSystem {

    public MacSystem(VedioFile vedioFile) {
        super(vedioFile);
    }

    @Override
    public void play() {
        System.out.print("Mac∆ΩÃ®≤•∑≈£∫");
        getVedioFile().decode();
    }
}
