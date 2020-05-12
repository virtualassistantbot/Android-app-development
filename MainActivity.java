package com.example.movieticketbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void userLogin(View view ){
        Intent obj= new Intent(getApplicationContext(),userpasslogin.class);
        startActivity(obj);
    }
    public void adminLogin(View view){
        Intent obj1= new Intent(getApplicationContext(),adminpasslogin.class);
        startActivity(obj1);
    }
}

