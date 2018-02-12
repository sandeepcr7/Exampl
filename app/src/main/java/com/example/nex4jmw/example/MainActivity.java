package com.example.nex4jmw.example;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {
    ViewPager Tab;
    TabPagerAdapter TabAdapter;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabAdapter  = new TabPagerAdapter(getSupportFragmentManager());

        Tab = (ViewPager)findViewById(R.id.pager);

        Tab.setOnPageChangeListener(
                new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int position) {

                        actionBar = getActionBar();
                        actionBar.setSelectedNavigationItem(position);                    }
                });
        Tab.setBackgroundColor(Color.parseColor("#0000ff"));
        Tab.setAdapter(TabAdapter);

        actionBar = getActionBar();
        //Enable Tabs on Action Bar
        //Color For tabs
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0000ff")));

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.TabListener tabListener = new ActionBar.TabListener(){

            @Override
            public void onTabReselected(android.app.ActionBar.Tab tab,
                                        FragmentTransaction ft) {
                // TODO Auto-generated method stub
                Tab.setBackgroundColor(Color.parseColor("#0000ff"));
            }

            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
                Tab.setBackground(getResources().getDrawable(R.drawable.ic_launcher_background));
                Tab.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(android.app.ActionBar.Tab tab,
                                        FragmentTransaction ft) {
                // TODO Auto-generated method stub
                Tab.setBackgroundColor(Color.parseColor("#0000ff"));
            }};
        //Add New Tab
        actionBar.addTab(actionBar.newTab().setText("Android").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("iOS").setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("Windows").setTabListener(tabListener));

    }

}