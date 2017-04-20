package org.xyzmst.dagger2demo.entity;

import com.apkfuns.logutils.LogUtils;

import org.xyzmst.dagger2demo.qualifier.RoseFlower;

import javax.inject.Inject;

public class Pot {

    private Flower rose;

    @Inject
    public Pot(@RoseFlower Flower rose) {
        this.rose = rose;
        LogUtils.i("Pot()");
    }

    public String show() {
        return rose.whisper();

    }
}