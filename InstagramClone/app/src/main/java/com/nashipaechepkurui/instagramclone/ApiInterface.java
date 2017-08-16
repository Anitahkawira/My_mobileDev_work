package com.nashipaechepkurui.instagramclone;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Student on 7/1/2017.
 */
public interface ApiInterface {

    @GET("/contacts")
    Call<Users> getUsers();
}
