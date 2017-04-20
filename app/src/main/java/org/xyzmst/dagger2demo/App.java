package org.xyzmst.dagger2demo;

import android.app.Application;

import org.xyzmst.dagger2demo.component.DaggerFlowerComponent;
import org.xyzmst.dagger2demo.component.DaggerPotComponent;
import org.xyzmst.dagger2demo.component.PotComponent;

public class App extends Application {

    private PotComponent potComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        potComponent = DaggerPotComponent.builder()
                .flowerComponent(DaggerFlowerComponent.create())
                .build();
    }

    public PotComponent getPotComponent() {
        return potComponent;
    }
}