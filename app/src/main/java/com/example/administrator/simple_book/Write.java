package com.example.administrator.simple_book;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Write extends AppCompatActivity{
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write);
    }

    public void btnBack3(View view) {
        startActivity(new Intent(this, Main.class));
    }
}