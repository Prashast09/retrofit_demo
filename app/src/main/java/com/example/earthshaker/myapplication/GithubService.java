package com.example.earthshaker.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by earthshaker on 10/3/17.
 */

public interface GithubService {

    @GET("users/{user}/repo")
    public Call<List<GithubRepo>> getRepos(String user);
}
