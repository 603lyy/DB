package com.db;

import com.google.gson.JsonObject;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 作者：lyy on 2017/5/11 14:53
 */

public interface API {
    int LIMIT = 20;

    @GET("in_theaters")
    Flowable<JsonObject> getShowingList(
            @Query("apikey") String apikey,
            @Query("city") String city,
            @Query("start") String start,
            @Query("count") String count
    );
}