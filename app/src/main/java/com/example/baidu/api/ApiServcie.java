package com.example.baidu.api;



import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiServcie {

    String urls="http://106.13.63.54:8080/sys/";
    @GET("home.json")
    Observable<HomeBean> getData();

    /*String Article_urls="http://106.13.63.54:8080/";
    @GET("sys/classShop.json")
    Observable<Article> getArticle();*/
}
