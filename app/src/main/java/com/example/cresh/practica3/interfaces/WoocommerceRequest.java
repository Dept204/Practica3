package com.example.cresh.practica3.interfaces;

import com.example.cresh.practica3.pojo.Orders;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by zero_ on 09/12/2016.
 */

public interface WoocommerceRequest {


    @GET("/wc-api/v3/customers/{id}/orders")
    Call<Orders> userOrders(@Path("id") String userID);

}
