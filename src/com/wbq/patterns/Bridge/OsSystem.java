package com.wbq.patterns.Bridge;

/**
 * @ClassName OsSystem
 * @Description TODO
 * @Author wbq
 * @Date 2021/1/2 17:04
 * @Version 1.0
 */
public abstract class OsSystem {
    private VedioFile vedioFile;

    public OsSystem(VedioFile vedioFile) {
        this.vedioFile = vedioFile;
    }

    public VedioFile getVedioFile() {
        return vedioFile;
    }

    public void setVedioFile(VedioFile vedioFile) {
        this.vedioFile = vedioFile;
    }

    public abstract void play();

}
