package org.xyzmst.dagger2demo.entity;

import com.apkfuns.logutils.LogUtils;

/**
 * @author mac
 * @title Rose
 * @description
 * @modifier
 * @date
 * @since 2017/4/23 11:11
 **/
public class Rose extends Flower{

    public Rose() {
        LogUtils.d("");
    }

    public String whisper() {
        return "热恋";
    }
}
