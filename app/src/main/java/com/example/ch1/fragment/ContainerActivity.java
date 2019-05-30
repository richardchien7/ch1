package com.example.ch1.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.Fragment;

import com.example.ch1.R;

public class ContainerActivity extends AppCompatActivity {
    private AFragment aFragment;
    private BFragment bFragment;
    private Button mBtnChange;
    private Button mBtnchangeA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        mBtnChange = (Button) findViewById(R.id.btn_changeb);
        mBtnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bFragment == null) {
                    bFragment = new BFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, bFragment).commitAllowingStateLoss();
            }
        });
        mBtnchangeA = (Button) findViewById(R.id.btn_changea);

        mBtnchangeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (aFragment == null) {
                    aFragment = new AFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, aFragment).commitAllowingStateLoss();
            }
        });
        //實例化AFragment
        aFragment = new AFragment();
        //把AFragment添加到Activity中，記得調用commit
        getSupportFragmentManager().beginTransaction().add(R.id.fl_container, aFragment).commitAllowingStateLoss();
    }
}
