package org.xyzmst.dagger2demo.component;

import org.xyzmst.dagger2demo.MainActivity;

import dagger.Subcomponent;

/**
 * @author mac
 * @title MainActivityComponent
 * @description
 * @modifier
 * @date
 * @since 2017/4/23 11:15
 **/
@Subcomponent
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
