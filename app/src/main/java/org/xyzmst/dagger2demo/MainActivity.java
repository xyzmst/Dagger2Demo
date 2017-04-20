package org.xyzmst.dagger2demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.apkfuns.logutils.LogUtils;

import org.xyzmst.dagger2demo.component.DaggerMainActivityComponent;
import org.xyzmst.dagger2demo.entity.Pot;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    Pot mPot;


    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.
                builder()
                .potComponent(((App)getApplication()).getPotComponent())
                .build()
                .inject(this);

//        DaggerFlowerComponent.create()
//                .plus(new PotModule())
//                .plus()
//                .inject(this);

        LogUtils.d("mPot=" + mPot);

        findViewById(R.id.start_second)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);
                    }
                });

    }
}
