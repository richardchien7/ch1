package com.example.ch1.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.Fragment;
import android.widget.TextView;

import com.example.ch1.R;

public class ContainerActivity extends AppCompatActivity implements  AFragment.IOnMessageClick{
    private AFragment aFragment;
    private BFragment bFragment;
    private Button mBtnChange;
    private Button mBtnchangeA;
    private TextView mTvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        mTvTitle = findViewById(R.id.tv_title);
        //mBtnChange = (Button) findViewById(R.id.btn_changeb);
//        mBtnChange.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (bFragment == null) {
//                    bFragment = new BFragment();
//                }
//                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, bFragment).commitAllowingStateLoss();
//            }
//        });


//        mBtnchangeA = (Button) findViewById(R.id.btn_changea);
//
//        mBtnchangeA.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (aFragment == null) {
//                    aFragment = new AFragment();
//                }
//                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, aFragment).commitAllowingStateLoss();
//            }
//        });
        //實例化AFragment
        aFragment = AFragment.newInstance("what the fuck");
        //把AFragment添加到Activity中，記得調用commit
        getSupportFragmentManager().beginTransaction().add(R.id.fl_container, aFragment,"a").commitAllowingStateLoss();
    }

    public void setData(String text){
        mTvTitle.setText(text);
    }

    @Override
    public void onClick(String text) {
        mTvTitle.setText(text);
    }
}
