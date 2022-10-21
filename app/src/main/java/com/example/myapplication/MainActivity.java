package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void persegi(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Persegi()).commit();
    }

    public void segitiga(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Segitiga()).commit();
    }

    public void lingkaran(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Lingkaran()).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Persegi()).commit();
    }
}