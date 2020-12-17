package com.example.day02_lx.utils.net;

public interface INetWorkInterface {
    public <T> void getData(String url,INetCallBack<T> callBack);
}
