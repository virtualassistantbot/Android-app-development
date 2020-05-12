package com.example.movieticketbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CashPayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_payment);
        TextView tv=(TextView) findViewById(R.id.textView22);
        int num=+(int)(Math.random()*(111111*999999));
        tv.setText("Your payment mode is by cash and  your transaction id generated is"+num);
    }
    public void feedbackPage(View view){
        Intent obj=new Intent(getApplicationContext(),FeedbackForm.class);
        startActivity(obj);
    }
    public void logoutPage(View view){
        Intent obj=new Intent(getApplicationContext(),LogoutForm.class);
        startActivity(obj);
    }
}
