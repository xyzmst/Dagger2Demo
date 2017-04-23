package org.xyzmst.dagger2demo.component;

import org.xyzmst.dagger2demo.module.PotModule;

import dagger.Subcomponent;

/**
 * @author mac
 * @title PotComponent
 * @description
 * @modifier
 * @date
 * @since 2017/4/23 12:26
 **/
@Subcomponent(modules = PotModule.class)
public interface PotComponent {
    MainActivityComponent plus();
}
