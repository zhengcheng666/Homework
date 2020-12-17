package com.example.homeworkone.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.homeworkone.R;
import com.example.homeworkone.base.BaseActivity;

public class ViewActivity extends BaseActivity<Pers> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}