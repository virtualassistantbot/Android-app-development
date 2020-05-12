package com.example.movieticketbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class userpasslogin extends AppCompatActivity {
    EditText uname,pw;

    String      user,passwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userpasslogin);
        uname=(EditText)findViewById(R.id.editText);
        pw=(EditText)findViewById(R.id.editText3);
    }
    public void registrationForm(View view){
        Intent obj=new Intent(getApplicationContext(),Registration.class);
        startActivity(obj);
    }
    public void loginSuccess(View view) {

        user=uname.getText().toString();
        passwd=pw.getText().toString();



        if (user.isEmpty() || passwd.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please Enter Your UserName & Password", Toast.LENGTH_LONG).show();
        }


        else if(user.equals("user") && passwd.equals("user1234")){
            Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();
            Intent obj1=new Intent(getApplicationContext(),Usertime.class);
            startActivity(obj1);
        }
        else{
            Toast.makeText(getApplicationContext(), "Login Unsuccessful : Please enter the correct details and register if u have not registered!!",
                    Toast.LENGTH_LONG).show();

        }
    }}

