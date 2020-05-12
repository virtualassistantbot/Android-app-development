package com.example.movieticketbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class OnlinePayment extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_payment);
        e1=(EditText)findViewById(R.id.editText20);
        e2=(EditText)findViewById(R.id.editText22);
        e3=(EditText)findViewById(R.id.editText23);
        e4=(EditText)findViewById(R.id.editText24);

    }
    public void payBill(View view){
        String str1,str2,str3,str4;
        str1=e1.getText().toString();
        str2=e2.getText().toString();
        str3=e3.getText().toString();
        str4=e4.getText().toString();
        if(str1.isEmpty() || str2.isEmpty() || str3.isEmpty() || str4.isEmpty()){
            Toast.makeText(getApplicationContext(),"the fields should not remain empty",Toast.LENGTH_LONG).show();
        }
        else{
            Intent obj=new Intent(getApplicationContext(),ConfirmOnlinePayment.class);
            startActivity(obj);
        }
    }

}
