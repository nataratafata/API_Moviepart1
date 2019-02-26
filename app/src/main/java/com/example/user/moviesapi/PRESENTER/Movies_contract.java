package com.example.user.moviesapi.PRESENTER;

import com.example.user.moviesapi.ModelData.MoviesObject;


public class Movies_contract {

    public interface View_Movies {

        void displayProgressDialog();
        void moviesList(MoviesObject moviesModel);
        void dismissProgressDialog();
    }

    public interface Presenter_Movies{

        void onBind(View_Movies view_movies);
        void getMoviesFromAPI();
        void unBind();
    }

}
