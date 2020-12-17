package com.example.homeworkone.base;

/**
 * @创建时间 2020/12/17 19:07
 */
public class BasePersenter<V extends Baseview> {
    public V iView;
    public void attachview(V v){
        iView=v;
    }
}
