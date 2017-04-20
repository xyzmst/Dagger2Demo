package org.xyzmst.dagger2demo.module;

import com.apkfuns.logutils.LogUtils;

import org.xyzmst.dagger2demo.entity.Flower;
import org.xyzmst.dagger2demo.entity.Lily;
import org.xyzmst.dagger2demo.entity.Rose;
import org.xyzmst.dagger2demo.qualifier.LilyFlower;
import org.xyzmst.dagger2demo.qualifier.RoseFlower;

import dagger.Module;
import dagger.Provides;

/**
 * @author mac
 * @title FlowerModule
 * @description
 * @modifier
 * @date
 * @since 2017/4/20 23:34
 **/

@Module
public class FlowerModule {
    @Provides
    @RoseFlower
    Flower provideRose() {
        LogUtils.i("provideRose()");
        return new Rose();
    }

    @Provides
    @LilyFlower
    Flower provideLily() {
        LogUtils.i("provideLily()");
        return new Lily();
    }
}
