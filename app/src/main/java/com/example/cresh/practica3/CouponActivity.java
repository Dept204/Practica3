package com.example.cresh.practica3;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.cresh.practica3.pojo.Coupons;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CouponActivity extends AppCompatActivity {

    // TODO:
    // <------ Esto deberia de ir en otro lado --->
    private final String BASE_URL              = "https://tangaweb-cresh.rhcloud.com/wp-json/wc/v1/coupons";
    private final String CONSUMER_SECRET       = "cs_ac9c2bf5c94cb766fcf1965a497c851b5d9b5f7d";
    private final String CONSUMER_KEY          = "ck_0abbe89508b5500cbe3640936a9fed6a69864ba3";
    // <------------------------------------------->

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Coupons[] cupones;
    private CardAdapter adapter;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupons);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        cupones = new Coupons[0];
        getCoupons();
    }

    private void getCoupons() {
        final ProgressDialog loading = ProgressDialog.show(this,"Cargando datos", "Espere...",false,false);

        StringRequest jsonArrayRequest = new StringRequest(Request.Method.GET,BASE_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        loading.dismiss();
                       parseData(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                })
        {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> headers = new HashMap<>();
                String credentials = CONSUMER_KEY + ":" + CONSUMER_SECRET;
                String auth = "Basic "
                        + Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);
                headers.put("Content-Type", "application/json");
                headers.put("Authorization", auth);
                return headers;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);
    }

    private void parseData(String response)
    {
        Gson gson = new Gson();
        Coupons[] cupones = gson.fromJson(response,Coupons[].class);
        Intent i = getIntent();
        String email = i.getStringExtra("email");
        int contador = 0;
        List<Integer> lista = new ArrayList<Integer>(0);
        for (int j = 0; j < cupones.length; j++)
            for (int k = 0; k < cupones[j].getEmail_restrictions().length; k++)
                if (cupones[j].getEmail_restrictions()[k].equals(email)) {
                    contador++;
                    lista.add(j);
                    break;
                }
        Coupons[] newcupons = new Coupons[contador];
        for (int j = 0; j < contador; j++) newcupons[j] = cupones[lista.get(j)];
        adapter = new CardAdapter(newcupons, this);
        recyclerView.setAdapter(adapter);
    }
}
