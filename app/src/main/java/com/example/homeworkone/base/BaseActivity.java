package com.example.homeworkone.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @创建时间 2020/12/17 19:06
 */
public abstract class BaseActivity<T extends BasePersenter> extends AppCompatActivity {
    public T pernster;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getlayoutID());
        if (pernster==null){
            pernster=getPernster();
        }
        initview();
        initData();
    }

    protected abstract void initData();

    protected abstract void initview();

    protected abstract T getPernster();

    protected abstract int getlayoutID();
}
