package com.example.day02_lx.pernster;

import com.example.day02_lx.base.BasePersenter;
import com.example.day02_lx.bean.HomeBean;
import com.example.day02_lx.contract.HomeContract;
import com.example.day02_lx.contract.MainContract;
import com.example.day02_lx.model.HomeModel;
import com.example.day02_lx.utils.net.INetCallBack;
import com.example.day02_lx.utils.net.URLConstant;
import com.example.day02_lx.view.HomeActivity;

public class HomePernster extends BasePersenter<HomeContract.IHomeView> implements HomeContract.IHomePresenter{

    private HomeContract.IHomeModel homeModel;

    public HomePernster(HomeContract.IHomeView homeView) {

        homeModel=new HomeModel(this);
    }

    @Override
    public void login() {
        homeModel.getLoginData(URLConstant.NEWLIST, new INetCallBack<HomeBean>() {
            @Override
            public void onSuccess(HomeBean homeBean) {
                iView.getData(homeBean);
            }

            @Override
            public void onFail(String err) {
                iView.onFail(err);
            }
        });
    }
}
