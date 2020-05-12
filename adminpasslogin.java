package com.example.movieticketbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class adminpasslogin extends AppCompatActivity {
    EditText uname,pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminpasslogin);
        uname=(EditText)findViewById(R.id.editText11);
        pwd=(EditText)findViewById(R.id.editText12);
    }
    public void adminLogin(View view)     {
        String str1, str2;
        str1 = uname.getText().toString();
        str2 = pwd.getText().toString();

        if(str1.isEmpty() || str2.isEmpty()){
            Toast.makeText(getApplicationContext(), "Please Enter Your UserName & Password", Toast.LENGTH_LONG).show();         }

        else if(str1.equals("admin") && str2.equals("admin1234")){
            Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();
            Intent obj = new Intent(getApplicationContext(),Admintime.class);
            startActivity(obj);
        }
        else{
            Toast.makeText(getApplicationContext(), "Login Unsuccessful : Please enter the correct details", Toast.LENGTH_LONG).show();
        }
    }


}
