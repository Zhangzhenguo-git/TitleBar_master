package com.dc.titlebar_master;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.dc.multititlebar.MultiTitleBar;

public class MainActivity extends AppCompatActivity {
    private MultiTitleBar multiTitleBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        multiTitleBar=findViewById(R.id.mTitleBar);
        multiTitleBar.setHeadShowOrHide(View.VISIBLE, View.VISIBLE, View.GONE, View.VISIBLE);
        multiTitleBar.setHeadContent(R.drawable.msg_return_icon, "特色小吃", R.drawable.msg_search_icon, "编辑");
    }
}
