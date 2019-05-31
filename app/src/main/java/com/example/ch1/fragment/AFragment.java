package com.example.ch1.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.example.ch1.R;

public class AFragment extends Fragment {
    private TextView mTvTitle;
    private Button mBtnChange,mBtnReset,mBtnMessage;
    private BFragment bFragment;
    private IOnMessageClick listener;
    private Activity mActivity;

    public static AFragment newInstance(String title){
        AFragment fragment = new AFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title",title);
        fragment.setArguments(bundle);
        return fragment;
    }

    public interface IOnMessageClick{
        void onClick(String text);
    }

    public void onAttach(Context context){
        super.onAttach(context);
        try {
            listener = (IOnMessageClick) context;
        }catch (ClassCastException e){
            throw new ClassCastException("Activity 必須實現 IOnMessageClick接口");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        Log.d("AFragment","--------onCreatedView--------");
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTvTitle = (TextView) view.findViewById(R.id.tv_title);
        mBtnChange =(Button) view.findViewById(R.id.btn_changeb);
        mBtnReset = (Button) view.findViewById(R.id.btn_reset);
        mBtnMessage = (Button) view.findViewById(R.id.btn_message);
        mBtnMessage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //((ContainerActivity)getActivity()).setData("hi");
                listener.onClick("hi");
            }
        });
        mBtnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bFragment == null) {
                    bFragment = new BFragment();
                }
                Fragment fragment = getFragmentManager().findFragmentByTag("a");
                if(fragment != null){
                    getFragmentManager().beginTransaction().hide(fragment).add(R.id.fl_container, bFragment).addToBackStack(null).commitAllowingStateLoss();
                }else{
                    getFragmentManager().beginTransaction().replace(R.id.fl_container, bFragment).addToBackStack(null).commitAllowingStateLoss();
                }

            }
        });
        mBtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvTitle.setText("new words");
            }
        });
        if(getArguments() != null){
            mTvTitle.setText(getArguments().getString("title"));
        }
    }


}
