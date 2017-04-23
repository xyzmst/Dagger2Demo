package org.xyzmst.dagger2demo.module;

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
 * @since 2017/4/23 11:49
 **/
@Module
public class FlowerModule {

    @Provides
    @RoseFlower
    Flower provideRose(){
        return new Rose();
    }

    @Provides
    @LilyFlower
    Flower provideLily(){
        return new Lily();
    }

}
