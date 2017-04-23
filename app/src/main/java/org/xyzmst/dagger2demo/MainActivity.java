package org.xyzmst.dagger2demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.apkfuns.logutils.LogUtils;

import org.xyzmst.dagger2demo.component.DaggerMainActivityComponent;
import org.xyzmst.dagger2demo.entity.Pot;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    Pot mPot;
    @Inject
    Pot mPot2;

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.builder()
                .potComponent(((App) getApplication()).getPotComponent())
                .build()
                .inject(this);
        LogUtils.d("mPot=" + mPot);
        LogUtils.d("mPot2=" + mPot2);
        LogUtils.d(mPot.show());

        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);

    }
}
