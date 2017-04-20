package org.xyzmst.dagger2demo.entity;

import com.apkfuns.logutils.LogUtils;

import javax.inject.Inject;

/**
 * @author mac
 * @title Lily
 * @description
 * @modifier
 * @date
 * @since 2017/4/20 23:31
 **/
public class Lily extends Flower {

    @Inject
    public Lily() {
        LogUtils.i("Lily()");
    }

    @Override
    public String whisper() {

        return "Lily";
    }
}
