package com.example.ch1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ch1.util.ToastUtil;

public class DialogActivity extends AppCompatActivity {
private Button mBtnDialog1,mBtnDialog2,mBtnDialog3,mBtnDialog4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        mBtnDialog1 =(Button) findViewById(R.id.btn_dialog1);
        mBtnDialog2 =(Button) findViewById(R.id.btn_dialog2);
        mBtnDialog3 =(Button) findViewById(R.id.btn_dialog3);
        mBtnDialog4 =(Button) findViewById(R.id.btn_dialog4);
        OnClick onClick = new OnClick();
        mBtnDialog1.setOnClickListener(onClick);
        mBtnDialog2.setOnClickListener(onClick);
        mBtnDialog3.setOnClickListener(onClick);
        mBtnDialog4.setOnClickListener(onClick);

    }
    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v){

            switch (v.getId()){
                case R.id.btn_dialog1:
                    AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
                    builder.setTitle("請回答").setMessage("你覺得課程如何? ")
                            .setIcon(R.drawable.fox)
                            .setPositiveButton("棒", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    ToastUtil.showMsg(DialogActivity.this,"乾我屁事");
                                }
                            }).setNeutralButton("還可", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this,"所以你想表達甚麼?");
                        }
                    }).setNegativeButton("差", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this,"講的好像你很厲害一樣");
                        }
                    }).show();
                    break;
                case R.id.btn_dialog2:
                    final String [] array2 = new String[]{"男","女"};
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(DialogActivity.this);
                    builder2.setTitle("選擇性別").setItems(array2, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this, array2[which]);
                        }
                    }).show();
                    break;
                case R.id.btn_dialog3:
                    final String [] array3 = new String[]{"男","女"};
                    AlertDialog.Builder builder3 = new AlertDialog.Builder(DialogActivity.this);
                    builder3.setSingleChoiceItems(array3, 0, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this, array3[which]);
                        }
                    }).show();
                    break;
                case R.id.btn_dialog4:
                    break;
            }
        }
    }
}
