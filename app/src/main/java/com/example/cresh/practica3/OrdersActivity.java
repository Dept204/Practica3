package com.example.cresh.practica3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.cresh.practica3.api.ServiceGenerator;
import com.example.cresh.practica3.interfaces.WoocommerceRequest;
import com.example.cresh.practica3.pojo.Orders;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class OrdersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        // Set Title
        setTitle("Gráficas");

        long user_id = getIntent().getLongExtra("uid", -1);
        WoocommerceRequest request = ServiceGenerator.createService(WoocommerceRequest.class,
                "ck_a0ce054c878aff32cf78fbdecfbf463233e36ff0",
                "cs_f27e08fd7cbf3be3cdffbe3b0ca126254a0d8747");
        request.userOrders(String.valueOf(user_id)).enqueue(new Callback<Orders>() {
            @Override
            public void onResponse(Call<Orders> call, Response<Orders> response) {
                Orders body = response.body();
                Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<Orders> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Something failed...", Toast.LENGTH_LONG).show();
            }
        });
    }
}
