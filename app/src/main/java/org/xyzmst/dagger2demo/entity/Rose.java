package org.xyzmst.dagger2demo.entity;

import com.apkfuns.logutils.LogUtils;

import javax.inject.Inject;

public class Rose extends Flower {

    @Inject
    public Rose() {
        LogUtils.i("Rose()");
    }

    public String whisper() {
        return "热恋";
    }
}