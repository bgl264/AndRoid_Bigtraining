package com.bgl.data;

import com.bgl.databean.Bean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by 包国梁 on 2020/5/28  17:34
 */
public interface ApiService {
    public String baseUrl="http://static.owspace.com/";

    @GET("?c=api&a=getList&page_id=0")
    Observable<Bean> getData();
}
