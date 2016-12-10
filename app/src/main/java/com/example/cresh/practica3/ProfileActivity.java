package com.example.cresh.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cresh.practica3.pojo.UserData;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    private long user_id;
    private TextView txtUsername;
    private TextView txtEmail;
    private TextView txtRol;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Intent intent = getIntent();
        Gson gson = new Gson();
        UserData user = gson.fromJson(intent.getStringExtra("User"),UserData.class);

        txtUsername = (TextView) findViewById(R.id.txtUsername);
        txtEmail = (TextView) findViewById(R.id.txtEmail);
        txtRol = (TextView) findViewById(R.id.txtRol);
        img = (ImageView) findViewById(R.id.imgUser);

        txtUsername.setText(user.getNombre_completo());
        txtEmail.setText(user.getUser().getEmail());
        txtRol.setText(user.getRol());

        user_id = user.getId();

        String image = user.getUser().getAvatar();
        int start = image.indexOf("src=\'") + 5;
        int end = image.indexOf("\'", image.indexOf("src=\'") + 5);

        String src = image.substring(start, end);
        Picasso.with(getApplicationContext()).load(src).into(img);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    public void summonOrdenes(MenuItem item) {
        Intent intent = new Intent(this, OrdersActivity.class);
        intent.putExtra("uid", user_id);
        startActivity(intent);
    }
}
