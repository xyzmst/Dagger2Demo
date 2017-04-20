package org.xyzmst.dagger2demo.module;

import com.apkfuns.logutils.LogUtils;

import org.xyzmst.dagger2demo.entity.Flower;
import org.xyzmst.dagger2demo.entity.Pot;
import org.xyzmst.dagger2demo.qualifier.RoseFlower;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author mac
 * @title PotModule
 * @description
 * @modifier
 * @date
 * @since 2017/4/21 00:12
 **/
@Module
public class PotModule {
    @Provides
    @Singleton
    Pot providePot(@RoseFlower Flower flower) {
        LogUtils.i("providePot()");
        return new Pot(flower);
    }
}
