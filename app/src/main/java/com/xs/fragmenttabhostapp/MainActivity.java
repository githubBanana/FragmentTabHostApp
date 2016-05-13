package com.xs.fragmenttabhostapp;

import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private FragmentTabHost mTabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this,getSupportFragmentManager(),R.id.realtabcontent);
        mTabHost.getTabWidget().setShowDividers(0);
        mTabHost.addTab(mTabHost.newTabSpec("one").setIndicator(getTabLayoutView(R.layout.tabs,"onetab")),OneFragment.class,null);
        mTabHost.addTab(mTabHost.newTabSpec("two").setIndicator(getTabLayoutView(R.layout.tabs,"twotab")),TwoFragment.class,null);
        mTabHost.addTab(mTabHost.newTabSpec("three").setIndicator(getTabLayoutView(R.layout.tabs,"threetab")),ThreeFragment.class,null);
        mTabHost.addTab(mTabHost.newTabSpec("four").setIndicator(getTabLayoutView(R.layout.tabs,"fourtab")),FourFragment.class,null);

    }


    private View getTabLayoutView(int layoutId,String tv) {
        View view =  getLayoutInflater().inflate(layoutId,null);
        TextView mTextView = (TextView) view.findViewById(R.id.tv_tabs_Id);
        mTextView.setText(tv);
        return view;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mTabHost = null;
    }
}
