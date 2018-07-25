package com.example.gram.highlight.Services.Interface;

import com.example.gram.highlight.Models.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface PostService {
    @GET("posts")
    Call<List<PostModel>> listPost();


    @GET("posts/{id}")
    Call<PostModel> singlePost(@Path("id") String id);


}