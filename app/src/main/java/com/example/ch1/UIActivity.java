package com.example.ch1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ch1.fragment.ContainerActivity;
import com.example.ch1.gridview.GridViewActivity;
import com.example.ch1.listview.ListViewActivity;
import com.example.ch1.recyclerview.RecyclerViewActivity;

public class UIActivity extends AppCompatActivity {
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
    //private Button mBtnWebBiew;
    private Button mBtnToast;
    private Button mBtnDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
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
        //mBtnWebBiew = (Button) findViewById(R.id.btn_webview);
        mBtnToast = (Button) findViewById(R.id.btn_toast);
        mBtnDialog = (Button) findViewById(R.id.btn_dialog);
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
        //mBtnWebBiew.setOnClickListener(onclick);
        mBtnToast.setOnClickListener(onclick);
        mBtnDialog.setOnClickListener(onclick);
    }

    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_textview:
                    intent = new Intent(UIActivity.this, TextView2Activity.class);
                    break;
                case R.id.btn_button:
                    intent = new Intent(UIActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    intent = new Intent(UIActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                   intent = new Intent(UIActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent = new Intent(UIActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    intent = new Intent(UIActivity.this, ImageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    intent = new Intent(UIActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    intent = new Intent(UIActivity.this, GridViewActivity.class);
                    break;
                case R.id.btn_tab:
                    intent = new Intent(UIActivity.this, TabActivity.class);
                    break;
                case R.id.btn_fragment:
                    intent = new Intent(UIActivity.this, ContainerActivity.class);
                    break;
                case R.id.btn_column:
                    intent = new Intent(UIActivity.this, testActivity.class);
                    break;
                case R.id.btn_recyclerview:
                    intent = new Intent(UIActivity.this, RecyclerViewActivity.class);
                    break;
                case R.id.btn_webview:
                    intent = new Intent(UIActivity.this,WebViewActivity.class);
                    break;
                case R.id.btn_toast:
                    intent = new Intent(UIActivity.this, ToastActivity.class);
                    break;
                case R.id.btn_dialog:
                    intent = new Intent(UIActivity.this,DialogActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
