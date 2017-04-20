package org.xyzmst.dagger2demo.component;

import org.xyzmst.dagger2demo.entity.Pot;
import org.xyzmst.dagger2demo.module.PotModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author mac
 * @title PotComponent
 * @description
 * @modifier
 * @date
 * @since 2017/4/21 00:44
 **/
@Singleton
//@Subcomponent(modules = PotModule.class)
@Component(modules = PotModule.class,dependencies = FlowerComponent.class)
public interface PotComponent {
    Pot getPot();

//    MainActivityComponent plus();
}
