package com.example.user.moviesapi.Network;

import com.example.user.moviesapi.ModelData.MoviesObject;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

public class Connection_Service implements Movies_Interacter {

    private static Retrofit retrofit;
    private static OkHttpClient okHttpClient;

    public Connection_Service() {getConnection();}

    public static Request_Interface getConnection(){

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

        retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()).client(okHttpClient)
                .baseUrl(API_Request.BASE_URL).build();

        return retrofit.create(Request_Interface.class);
    }

    @Override
    public Observable<MoviesObject> getMoviesList() {
        return getConnection().getMoviesList();
    }
}
