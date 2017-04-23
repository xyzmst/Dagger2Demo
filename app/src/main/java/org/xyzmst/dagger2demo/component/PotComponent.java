package org.xyzmst.dagger2demo.component;

import org.xyzmst.dagger2demo.entity.Pot;
import org.xyzmst.dagger2demo.module.PotModule;

import dagger.Component;

/**
 * @author mac
 * @title PotComponent
 * @description
 * @modifier
 * @date
 * @since 2017/4/23 12:26
 **/
@Component(modules = PotModule.class,dependencies = FlowerComponent.class)
public interface PotComponent {
    Pot getPot();
}
