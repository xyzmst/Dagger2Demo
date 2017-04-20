package org.xyzmst.dagger2demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.apkfuns.logutils.LogUtils;

import org.xyzmst.dagger2demo.component.DaggerSecondActivityComponent;
import org.xyzmst.dagger2demo.entity.Pot;

import javax.inject.Inject;


/**
 * @author mac
 * @title SecondActivity
 * @description
 * @modifier
 * @date
 * @since 2017/4/21 01:26
 **/
public class SecondActivity extends AppCompatActivity {

    @Inject
    Pot mPot;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerSecondActivityComponent.builder()
                .potComponent(((App)getApplication()).getPotComponent())
                .build()
                .inject(this);

        LogUtils.i("pot=" + mPot);
    }
}
