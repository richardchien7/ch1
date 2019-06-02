package com.example.ch1.util;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    public static Toast mtoast;
    public static void showMsg(Context context, String msg){
        if(mtoast == null){
            mtoast = Toast.makeText(context, msg, Toast.LENGTH_LONG);
        }else{
            mtoast.setText(msg);
        }
        mtoast.show();
    }
}
