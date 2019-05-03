package com.example.ch1.listview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ch1.R;

public class ListViewActivity extends Activity {
    private ListView mlv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        mlv1 = (ListView) findViewById(R.id.lv_1);
        mlv1.setAdapter(new MyListAdapter(ListViewActivity.this));
        mlv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this,"pos:"+position,Toast.LENGTH_SHORT).show();
            }
        });
        mlv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
            public boolean onItemLongClick(AdapterView<?> parent,View view,int position,long id){
                Toast.makeText(ListViewActivity.this,"長按"+position,Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
