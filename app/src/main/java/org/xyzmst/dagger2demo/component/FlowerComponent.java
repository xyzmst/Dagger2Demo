package org.xyzmst.dagger2demo.component;

import org.xyzmst.dagger2demo.entity.Flower;
import org.xyzmst.dagger2demo.module.FlowerModule;
import org.xyzmst.dagger2demo.qualifier.LilyFlower;
import org.xyzmst.dagger2demo.qualifier.RoseFlower;

import dagger.Component;

/**
 * @author mac
 * @title FlowerComponent
 * @description
 * @modifier
 * @date
 * @since 2017/4/21 00:33
 **/
@Component(modules = FlowerModule.class)
public interface FlowerComponent {
    @RoseFlower
    Flower getRoseFlower();

    @LilyFlower
    Flower getLilyFlower();

//    PotComponent plus(PotModule potModule);

}
