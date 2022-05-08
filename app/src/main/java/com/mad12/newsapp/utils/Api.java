package com.mad12.newsapp.utils;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

import com.mad12.newsapp.model.Article;
import com.mad12.newsapp.model.Category;

import java.util.List;

public interface Api {
//    public static final String BASE_URL = "https://mad-android-thanhpc.herokuapp.com/";
    public static final String BASE_URL = "http://10.0.2.2:5000/"; //localhost
    @GET("category/")
    Call<List<Category>> getAllCategory();

    @GET("article/id/{id}")
    Call<Article> getArticleById(@Path("id") String id);

    @GET("category/slug")
    Call<String> getCategoryBySlug(@Query("slug") String slug);

    @GET("article/search")
    Call<List<Article>> getArticlesByKey(@Query("title") String key);
}
