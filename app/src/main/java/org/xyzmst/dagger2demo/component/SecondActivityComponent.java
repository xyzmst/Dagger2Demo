package org.xyzmst.dagger2demo.component;

import org.xyzmst.dagger2demo.SecondActivity;
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
public interface SecondActivityComponent {
    void inject(SecondActivity activity);
}
