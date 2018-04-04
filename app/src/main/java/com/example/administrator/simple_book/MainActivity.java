package com.example.administrator.simple_book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view)
    {
        try{
            Intent intent = new Intent(this, ReadingActivity.class);
            startActivity(intent);
        }
        catch(Exception ex){
            Toast.makeText(this, ex.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
}
