package com.nashipaechepkurui.tmdbmovieapp.API;

import com.nashipaechepkurui.tmdbmovieapp.Models.MovieResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Student on 7/22/2017.
 */
public interface ApiInterface {
    @GET ("/3/movie/550?api_key=3d9bd69ca9b0ca9b2874e09eeefa4898")
    Call<MovieResult> getMovies();
}
