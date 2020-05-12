package com.example.movieticketbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class FeedbackForm extends AppCompatActivity {
     RatingBar rtb;
     Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_form);
      rtb = (RatingBar)findViewById(R.id.ratingBar);
      bt=(Button)findViewById(R.id.button27);
    }
    public void feedback(View view){
        Toast.makeText(getApplicationContext(),"Thanks for your valuable feedback",Toast.LENGTH_LONG).show();

    }
}
