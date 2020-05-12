package com.example.movieticketbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class bookingconfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookingconfirmation);
       // Bundle obj = getIntent().getExtras();
     //   String str1 = obj.getString("tickets");
        int  price;
        int Ticketprice=2;
        //Ticketprice=Integer.parseInt(str1);
        price=Ticketprice*150;
        TextView tv = (TextView)findViewById(R.id.textView18);
        tv.setText("price for your booking is" +price );
    }
    public void paymentMode(View view){
        Intent obj=new Intent(getApplicationContext(),Payment.class);
        startActivity(obj);
    }
}
