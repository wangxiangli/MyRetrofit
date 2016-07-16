package com.bush.myretrofit;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 嘉华盛世 on 2016-07-16.
 */
public class RetrofitHelper {
    private static final String TAG ="---------" ;

    public RetrofitHelper() {
    }

    private static RetrofitHelper retrofitHelper;
    //单立模式
    public static RetrofitHelper newInstance(){
        Log.i(TAG, "newInstance: ");
        if (retrofitHelper==null){
            retrofitHelper=new RetrofitHelper();
        }
        return retrofitHelper;
    }

//    Retrofit retrofit=new Retrofit.Builder()
//            .baseUrl("")
//            .addConverterFactory(GsonConverterFactory.create(new Gson()))
//            .build();

    //创建Retrofit对象
    public static Retrofit createRetrofit(){
        Log.i(TAG, "createRetrofit: ");
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(createGson()))
                .baseUrl(UrlConfig.BASE_URL)
                .build();
    }
    //创建Gson对象
    public static Gson createGson(){
        Log.i(TAG, "createGson: ");
        return new GsonBuilder()
                .serializeNulls()//当解析的的数据为null是不崩溃
                .enableComplexMapKeySerialization()//解析Map集合
                .create();
    }
    //获取RetrofitService对象
    public static RetrofitService getRetrofitService(){
        Log.i(TAG, "getRetrofitService: ");
        return createRetrofit().create(RetrofitService.class);
    }
}
