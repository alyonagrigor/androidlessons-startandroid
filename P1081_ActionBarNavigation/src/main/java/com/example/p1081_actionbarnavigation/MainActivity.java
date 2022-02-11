package com.example.p1081_actionbarnavigation;


import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.os.Bundle;
import android.app.FragmentTransaction;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {

    final String LOG_TAG = "myLogs";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






            ActionBar bar = getActionBar();

            bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

            Tab tab = bar.newTab();
            tab.setText("tab1");
            tab.setTabListener(this);
            bar.addTab(tab);

            tab = bar.newTab();
            tab.setText("tab2");
            tab.setTabListener(this);
            bar.addTab(tab);

        }

        @Override
        public void onTabReselected(Tab tab, FragmentTransaction ft) {
            Log.d(LOG_TAG, "reselected tab: " + tab.getText());
        }

        @Override
        public void onTabSelected(Tab tab, FragmentTransaction ft) {
            Log.d(LOG_TAG, "selected tab: " + tab.getText());
        }

        @Override
        public void onTabUnselected(Tab tab, FragmentTransaction ft) {
            Log.d(LOG_TAG, "unselected tab: " + tab.getText());
        }
    }