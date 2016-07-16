package com.bush.myretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @butterknife.InjectView(R.id.btn_get)
    Button btnGet;
    private RetrofitService retrofitService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butterknife.ButterKnife.inject(this);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://apicloud.mob.com/")
                //.addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
        retrofitService=retrofit.create(RetrofitService.class);
    }

    @butterknife.OnClick(R.id.btn_get)
    public void onClick() {
 //    http://apicloud.mob.com/v1/weather/query?province=江苏&key=14b49edf0cfb1&city=南京
        getMap();
     }

    private void localMethod() {
        Call<ResponseBody> call=retrofitService.getResult();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.i("----------", "onResponse: ");
                if (response.isSuccessful()){
                    try {
                        String result=response.body().string();
                        Log.i("------------", "onResponse: "+result);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        @Override
        public void onFailure(Call<ResponseBody> call, Throwable t) {
            Log.i("-----------", "onFailure: ");
        }
    });
    }

    private void getWrong() {
        Call<ResponseBody> call= RetrofitHelper.newInstance().getRetrofitService().getResult();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.i("----------", "onResponse: ");
               if (response.isSuccessful()){
                    try {
                        String result=response.body().string();
                        Log.i("------------", "onResponse: "+result);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.i("-----------", "onFailure: ");
            }
        });
    }

    private void getMap() {
        Log.i("-----------", "onClick:  start");
        HashMap<String,String> map=new HashMap<>();
        map.put("key", UrlConfig.ParamsKey.KEY);
        map.put("city",UrlConfig.ParamsKey.CITY);
        map.put("province",UrlConfig.ParamsKey.PROVINCE);
        Call<ResponseBody> call= RetrofitHelper.newInstance()
                .getRetrofitService().getWeather(UrlConfig.URL_KEY,map);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()){
                    try {
                        String result=response.body().string();
                        Log.i("------------", "onResponse: "+result);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.i("------", "onFailure: ");
            }
        });
    }
}
