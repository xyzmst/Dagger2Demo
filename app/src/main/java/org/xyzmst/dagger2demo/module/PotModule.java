package org.xyzmst.dagger2demo.module;

import org.xyzmst.dagger2demo.entity.Flower;
import org.xyzmst.dagger2demo.entity.Pot;
import org.xyzmst.dagger2demo.qualifier.RoseFlower;

import dagger.Module;
import dagger.Provides;

/**
 * @author mac
 * @title PotModule
 * @description
 * @modifier
 * @date
 * @since 2017/4/23 12:14
 **/
@Module
public class PotModule {


    @Provides
    Pot providePot(@RoseFlower Flower rose){
        return new Pot(rose);
    }
}
