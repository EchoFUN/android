package com.iamunclexu.android;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventActivity extends AppCompatActivity {

    public String TAG = EventActivity.class.getName();

    @BindView(R.id.outest)
    LinearLayout mOutest;

    @BindView(R.id.outter)
    LinearLayout mOutter;

    @BindView(R.id.inner)
    View mInner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        ButterKnife.bind(this);

        bindEvents();
    }


    public void bindEvents() {

        mInner.setOnClickListener(view -> {
            Log.e(TAG, "bindEvents: Click mInner !");
        });

        mOutter.setOnClickListener(view -> {
            Log.e(TAG, "bindEvents: Click mOutter !");
        });

        mOutest.setOnClickListener(view -> {
            Log.e(TAG, "bindEvents: Click mOutest !");
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }
}
