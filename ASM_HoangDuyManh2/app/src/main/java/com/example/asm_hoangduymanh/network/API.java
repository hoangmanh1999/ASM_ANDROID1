package com.example.asm_hoangduymanh.network;

import com.example.asm_hoangduymanh.model.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {
    String APIKEY ="b8GfmQLW9yEl67hsXriNBX9HBBHsYGlM";
    String SERVER ="http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/";
    String URI = "353412?apikey="+APIKEY+"&language=vi-vn&metric=true";
    @GET(URI)
    Call<List<Item>> GetListData();
}
