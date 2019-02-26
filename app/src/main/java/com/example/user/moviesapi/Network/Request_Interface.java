package com.example.user.moviesapi.Network;

import com.example.user.moviesapi.ModelData.MoviesObject;


import retrofit2.http.GET;
import rx.Observable;

public interface Request_Interface {

    @GET(API_Request.MOVIES_URL)
    Observable<MoviesObject> getMoviesList();
}
