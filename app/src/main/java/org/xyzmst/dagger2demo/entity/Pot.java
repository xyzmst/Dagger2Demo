package org.xyzmst.dagger2demo.entity;

import com.apkfuns.logutils.LogUtils;

/**
 * @author mac
 * @title Pot
 * @description
 * @modifier
 * @date
 * @since 2017/4/23 11:12
 **/
public class Pot {

    private Flower mRose;

    public Pot(Flower rose) {
        mRose = rose;
        LogUtils.d("");
    }

    public String show() {
        return mRose.whisper();
    }

}
