package com.example.movieticketbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Admintime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admintime);
    }
    public void displayPage(View view){
        Intent obj =new Intent(getApplicationContext(),AdminDelete.class);
        startActivity(obj);
    }
    public void deletePage(View view){
        Intent obj =new Intent(getApplicationContext(),AdminDelete.class);
        startActivity(obj);
    }
    public void insertPage(View view){
        Intent obj=new Intent(getApplicationContext(),AdminInsert.class);
        startActivity(obj);
    }
    public void  updatePage(View view){
        Intent  obj=new Intent(getApplicationContext(),AdminUpdate.class);
        startActivity(obj);
    }
}


