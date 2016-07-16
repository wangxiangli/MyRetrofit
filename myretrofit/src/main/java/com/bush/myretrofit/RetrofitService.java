package com.bush.myretrofit;

import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Created by 嘉华盛世 on 2016-07-16.
 */
public interface RetrofitService {
    @GET("{path}?")
    Call<ResponseBody> getWeather(@Path("path") String path,
                                  @QueryMap HashMap<String,String> map);

    @GET("v1/weather/query?province=江苏&key=14b49edf0cfb1&city=南京")
   Call<ResponseBody> getResult();


    @POST("{path}?")
    Call<ResponseBody> getPost(@Path("path")
                               String path,
                               @QueryMap
                               HashMap<String ,String> map);

}
