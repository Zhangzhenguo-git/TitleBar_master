package com.dc.titlebar_master;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.dc.loading.LoadingView;
import com.dc.multititlebar.MultiTitleBar;

public class MainActivity extends AppCompatActivity {
    private MultiTitleBar multiTitleBar;
    private LoadingView mLoadingView;
    private LoadingView mLoadingView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        multiTitleBar=findViewById(R.id.mTitleBar);
        multiTitleBar.setHeadShowOrHide(View.VISIBLE, View.VISIBLE, View.GONE, View.VISIBLE);
        multiTitleBar.setHeadContent(R.drawable.msg_return_icon, "特色小吃", R.drawable.msg_search_icon, "编辑");
        multiTitleBar.setOnHeadItemClickListener(new MultiTitleBar.onHeadItemClickListener() {
            @Override
            public void onHeadReturn(View view) {
                //左侧返回按钮
                Toast.makeText(MainActivity.this, "一下返回到了小吃街", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onHeadRight(View view) {
//                右侧图标功能按钮，可根据自己需求设置图标
                Toast.makeText(MainActivity.this, "搜索到好多好吃的", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onHeadRightText(View view) {
//                右侧文字功能按钮，可根据自己需求设置图标
                Toast.makeText(MainActivity.this, "购买了好多好吃的", Toast.LENGTH_SHORT).show();

            }
        });

        mLoadingView=findViewById(R.id.loadView);
        mLoadingView1=findViewById(R.id.loadView1);
        mLoadingView.run();
        mLoadingView1.run();
    }
}
