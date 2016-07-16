package com.bush.myretrofit;

/**
 * Created by 嘉华盛世 on 2016-07-16.
 *   //    http://apicloud.mob.com/v1/weather/query?province=江苏&key=14b49edf0cfb1&city=南京
 */
public class UrlConfig {
    public static final String BASE_URL="http://apicloud.mob.com/";
    public static final String URL_KEY="v1/weather/query";

    public static class ParamsKey{
        public static final String PROVINCE="江苏";
        public static final String KEY="14b49edf0cfb1";
        public static final String CITY="南京";
    }
}
