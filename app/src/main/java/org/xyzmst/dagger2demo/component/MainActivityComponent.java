package org.xyzmst.dagger2demo.component;

import org.xyzmst.dagger2demo.MainActivity;
import org.xyzmst.dagger2demo.scope.ActivityScope;

import dagger.Component;

/**
 * @author mac
 * @title MainActivityComponent
 * @description
 * @modifier
 * @date
 * @since 2017/4/23 11:15
 **/
@ActivityScope
@Component(dependencies = PotComponent.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
