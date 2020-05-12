package com.example.movieticketbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {
    EditText name,email,phone;
    CheckBox male,femail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        name=(EditText)findViewById(R.id.editText2);
        email=(EditText)findViewById(R.id.editText4);
        phone=(EditText)findViewById(R.id.editText5);
    }
    public void registeredSuccess(View view){
        String str1,str2,str3;
        str1=name.getText().toString();
        str2=email.getText().toString();
        str3=phone.getText().toString();
        Toast.makeText(getApplicationContext(),"Registered successfully login with your username and password",Toast.LENGTH_LONG).show();
        Intent obj=new Intent(getApplicationContext(),userpasslogin.class);
        //  obj.putExtra("Email",str2);
        //   obj.putExtra("Phone",str3);
        startActivity(obj);
    }

}
