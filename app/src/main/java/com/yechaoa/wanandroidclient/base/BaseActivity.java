package com.yechaoa.wanandroidclient.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;

import butterknife.ButterKnife;

/**
 * GitHub : https://github.com/yechaoa
 * CSDN : http://blog.csdn.net/yechaoa
 * <p>
 * Created by yechao on 2018/4/22.
 * Describe :
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //竖屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setContentView(LayoutInflater.from(this).inflate(getLayoutId(), null));

        ButterKnife.bind(this);

    }

    @Override
    protected void onStart() {
        super.onStart();

        initView();

        initData();
    }

    @Override
    protected void onResume() {
        super.onResume();

        initListener();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //do something
    }

    protected abstract int getLayoutId();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract void initListener();

}
