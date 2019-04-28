package com.example.ch1;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextView2Activity extends AppCompatActivity {
    private TextView mTv4;
    private TextView mTv5;
    private TextView mTv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view2);
        mTv4 = (TextView) findViewById(R.id.tv_4);
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        mTv4.getPaint().setAntiAlias(true);

        mTv5 =(TextView) findViewById(R.id.tv_5);
        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);

        mTv6 =(TextView) findViewById(R.id.tv_6);
        mTv6.setText(Html.fromHtml("<u>我飄向北方~</u>"));
    }
}
