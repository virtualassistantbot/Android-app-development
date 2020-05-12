package com.example.movieticketbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmOnlinePayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_online_payment);
        TextView tv =(TextView) findViewById(R.id.textView27);
        int num1=(int)(Math.random()*(111111*999999));
        tv.setText("Your payment mode is online and your transaction id generated is"+num1);
    }
    public void logoutPage(View view){
        Intent obj=new Intent(getApplicationContext(),LogoutForm.class);
        startActivity(obj);
    }
    public void feedbackPage(View view){
        Intent obj=new Intent(getApplicationContext(),FeedbackForm.class);
        startActivity(obj);
    }
}
