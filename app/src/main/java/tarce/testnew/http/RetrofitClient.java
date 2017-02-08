package tarce.testnew.http;


import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Daniel.Xu on 2016/12/15.
 */

public class RetrofitClient {
    private  static  Retrofit retrofit;

   private RetrofitClient(Context context) {
        retrofit = new Retrofit.Builder()
                //设置OKHttpClient
                .client(new OKHttpFactory(context).getOkHttpClient())

                //baseUrl
                .baseUrl("http://192.168.2.111:8069/linkloving_app_api/")
                //gson转化器
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public static Retrofit getInstance(Context context) {
        if (retrofit==null){
            new RetrofitClient(context);
        }
        return retrofit;
    }
}
