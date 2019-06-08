package com.example.ch1;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.ch1.util.ToastUtil;

public class ProgressActivity extends AppCompatActivity {
    private ProgressBar mPb3;
    private Button mBtnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        mPb3 =(ProgressBar) findViewById(R.id.pb3);
        mBtnStart = (Button) findViewById(R.id.btn_start);
        mBtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //handler.sendEmptyMessage(0);
            }
        });

//        final Handler handler = new Handler(){
//            @Override
//            public void handleMessage(Message msg) {
//                super.handleMessage(msg);
//                if (mPb3.getProgress() < 100) {
//                   handler.postDelayed(runnable,500)
//                }else{
//                    ToastUtil.showMsg(ProgressActivity.this,"加載完成");
//                }
//            }
//        };
//     Runnable runnable = new Runnable() {
//         @Override
//         public void run() {
//             mPb3.setProgress(mPb3.getProgress() + 5);
//         }
//     };

    }
}
