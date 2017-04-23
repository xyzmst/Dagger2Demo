package org.xyzmst.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.apkfuns.logutils.LogUtils;

import org.xyzmst.dagger2demo.component.DaggerFlowerComponent;
import org.xyzmst.dagger2demo.entity.Pot;
import org.xyzmst.dagger2demo.module.PotModule;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    Pot mPot;


    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerFlowerComponent.create()
                .plus(new PotModule())
                .plus()
                .inject(this);
        LogUtils.d("mPot=" + mPot);
        LogUtils.d(mPot.show());


    }
}
