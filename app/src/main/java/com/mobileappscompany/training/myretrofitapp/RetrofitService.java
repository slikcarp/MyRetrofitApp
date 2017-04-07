package com.mobileappscompany.training.myretrofitapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitService {

    /**
     * GitHub repositories fo a given user endpoint.
     * @return
     */
    @GET("users/{username}/repos")
    Call<List<GitHub>> performRequest(@Path("username") String user);
}
