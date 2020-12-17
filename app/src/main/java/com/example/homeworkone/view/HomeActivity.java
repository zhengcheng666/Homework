package com.example.day02_lx.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.day02_lx.R;
import com.example.day02_lx.adapter.HomeAdapter;
import com.example.day02_lx.base.BaseActivity;
import com.example.day02_lx.bean.HomeBean;
import com.example.day02_lx.contract.HomeContract;
import com.example.day02_lx.pernster.HomePernster;

import java.util.ArrayList;


public class HomeActivity extends BaseActivity<HomePernster>implements HomeContract.IHomeView {
private RecyclerView rel;
    private ArrayList<HomeBean.NewsDTO> list;
    private HomeAdapter homeAdapter;

    @Override
    protected int getLayoutID() {
        return R.layout.activity_home;
    }

    @Override
    protected void initview() {
        rel=findViewById(R.id.rel);
        rel.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        homeAdapter = new HomeAdapter(list, this);
        rel.setAdapter(homeAdapter);
    }

    @Override
    protected void initData() {
        pernster.login();
    }

    @Override
    public HomePernster getPernster() {
        return new HomePernster(this);
    }

    @Override
    public void getData(HomeBean homeBean) {
        list.addAll(homeBean.getNews());
        homeAdapter.notifyDataSetChanged();
    }

    @Override
    public void onFail(String err) {
        Toast.makeText(this, err, Toast.LENGTH_SHORT).show();
    }
}