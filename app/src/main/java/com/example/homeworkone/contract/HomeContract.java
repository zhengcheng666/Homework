package com.example.day02_lx.contract;

import com.example.day02_lx.base.BaseView;
import com.example.day02_lx.bean.HomeBean;
import com.example.day02_lx.utils.net.INetCallBack;

public class HomeContract {
    public interface IHomeModel{
        <T> void getLoginData(String url, INetCallBack<T> callBack);
    }
    public interface IHomePresenter{
        void login();
    }
    public interface IHomeView extends BaseView {
        void getData(HomeBean homeBean);

        void onFail(String err);
    }
}
