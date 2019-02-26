package com.example.user.moviesapi.Network;

import com.example.user.moviesapi.ModelData.MoviesObject;


import rx.Observable;

public interface Movies_Interacter {

    Observable<MoviesObject> getMoviesList();
}
