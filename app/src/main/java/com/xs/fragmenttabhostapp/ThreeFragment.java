package com.xs.fragmenttabhostapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-05-12 10:26
 * @email Xs.lin@foxmail.com
 */
public class ThreeFragment extends Fragment {
    private static final String TAG = "ThreeFragmetn";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab1_layout,container,false);
    }
}
