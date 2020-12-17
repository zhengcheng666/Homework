package com.example.day02_lx.model;

import com.example.day02_lx.contract.HomeContract;
import com.example.day02_lx.pernster.HomePernster;
import com.example.day02_lx.utils.net.INetCallBack;
import com.example.day02_lx.utils.net.RetrofitUtils;

public class HomeModel implements HomeContract.IHomeModel{
    private HomeContract.IHomePresenter homePernster;

    public HomeModel(HomeContract.IHomePresenter homePernster) {

        this.homePernster = homePernster;
    }

    @Override
    public <T> void getLoginData(String url, INetCallBack<T> callBack) {
        RetrofitUtils.getInstance().getData(url,callBack);
    }
}
