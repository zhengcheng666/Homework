package com.example.day02_lx.utils.net;

import com.example.day02_lx.bean.HomeBean;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiService {
    @GET
    Observable<ResponseBody> getData(@Url String url);
}
