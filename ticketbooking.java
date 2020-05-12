package com.example.movieticketbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ticketbooking extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticketbooking);
    }
    public void ticketBooking(View view){
        e1=(EditText)findViewById(R.id.editText9);
        e2=(EditText)findViewById(R.id.editText26);
        e3=(EditText)findViewById(R.id.editText27);
        e4=(EditText)findViewById(R.id.editText28);
        String str1,str2,str3,str4;
        str1=e1.getText().toString();
        str2=e2.getText().toString();
        str3=e3.getText().toString();
        str4=e4.getText().toString();
        int tickets;
        // ticket=Integer.parseInt(str4);
        if(str1.isEmpty() || str2.isEmpty() || str3.isEmpty() || str4.isEmpty()){
            Toast.makeText(getApplicationContext(),"the above fields should not be empty",Toast.LENGTH_LONG).show();
        }
        else{
           // Toast.makeText(getApplicationContext(),"welcome",Toast.LENGTH_LONG).show();
           Intent obj=new Intent(getApplicationContext(),bookingconfirmation.class);
           // obj.putExtra("tickets",str4);
            startActivity(obj);
        }
    }}

