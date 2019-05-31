package com.example.ch1.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ch1.R;

public class RecyclerViewActivity extends AppCompatActivity {
    private Button mBtnLinear, mBtnHor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mBtnLinear = (Button) findViewById(R.id.btn_linear);
        mBtnHor = (Button) findViewById(R.id.btn_hor);
        mBtnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerViewActivity.this,LinearRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnHor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerViewActivity.this,HorRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
