package org.xyzmst.dagger2demo.component;

import org.xyzmst.dagger2demo.module.FlowerModule;
import org.xyzmst.dagger2demo.module.PotModule;

import dagger.Component;

/**
 * @author mac
 * @title FlowerComponent
 * @description
 * @modifier
 * @date
 * @since 2017/4/23 12:19
 **/
@Component(modules = FlowerModule.class)
public interface FlowerComponent {

    PotComponent plus(PotModule potModule);
}
