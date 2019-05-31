package com.example.ch1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.ch1.fragment.ContainerActivity;
import com.example.ch1.gridview.GridViewActivity;
import com.example.ch1.listview.ListViewActivity;
import com.example.ch1.recyclerview.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;
    private Button mBtnTab;
    private Button mBtnFragment;
    private Button mBtnColumn;
    private Button mRv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnButton =(Button) findViewById(R.id.btn_button);
        mBtnTextView = (Button) findViewById(R.id.btn_textview);
        mBtnEditText = (Button) findViewById(R.id.btn_edittext);
        mBtnRadioButton = (Button) findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = (Button) findViewById(R.id.btn_checkbox);
        mBtnImageView = (Button)findViewById((R.id.btn_imageview));
        mBtnListView = (Button)findViewById(R.id.btn_listview);
        mBtnGridView = (Button)findViewById(R.id.btn_gridview);
        mBtnTab = (Button)findViewById(R.id.btn_tab);
        mBtnFragment = (Button)findViewById(R.id.btn_fragment);
        mBtnColumn = (Button) findViewById(R.id.btn_column);
        mRv = (Button) findViewById(R.id.btn_recyclerview);
        setListeners();
    }

    private void setListeners(){
        OnClick onclick = new OnClick();
        mBtnTextView.setOnClickListener(onclick);
        mBtnButton.setOnClickListener(onclick);
        mBtnEditText.setOnClickListener(onclick);
        mBtnRadioButton.setOnClickListener(onclick);
        mBtnCheckBox.setOnClickListener(onclick);
        mBtnImageView.setOnClickListener(onclick);
        mBtnListView.setOnClickListener(onclick);
        mBtnGridView.setOnClickListener(onclick);
        mBtnTab.setOnClickListener(onclick);
        mBtnFragment.setOnClickListener(onclick);
        mBtnColumn.setOnClickListener(onclick);
        mRv.setOnClickListener(onclick);
    }

    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_textview:
                    intent = new Intent(MainActivity.this, TextView2Activity.class);
                    break;
                case R.id.btn_button:
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                   intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    intent = new Intent(MainActivity.this, GridViewActivity.class);
                    break;
                case R.id.btn_tab:
                    intent = new Intent(MainActivity.this, TabActivity.class);
                    break;
                case R.id.btn_fragment:
                    intent = new Intent(MainActivity.this, ContainerActivity.class);
                    break;
                case R.id.btn_column:
                    intent = new Intent(MainActivity.this, testActivity.class);
                    break;
                case R.id.btn_recyclerview:
                    intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
