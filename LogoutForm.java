package com.example.movieticketbooking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LogoutForm extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout_form);
         tv=(TextView)findViewById(R.id.textView30);
         tv.setText("Your succesfully loggedout!!");
    }
}
