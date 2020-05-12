package com.example.movieticketbooking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AdminInsert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_insert);
    }
    public void insertMovie(View view)
    {
        DBAdapter db = new DBAdapter(this);
        //---add a contact---
        db.open();
        EditText txt1, txt2,txt3;
        String str1, str2,str3;

        txt1 = (EditText)findViewById(R.id.editText14);
        txt2 = (EditText)findViewById(R.id.editText15);
        txt3 = (EditText)findViewById(R.id.editText16);

        str1 = txt1.getText().toString();
        str2 = txt2.getText().toString();
        str3 = txt3.getText().toString();

        long id = db.insertMovie(str1, str2,str3);
        if(id != 0)
            Toast.makeText(getApplicationContext(),"Data Inserted Successfully ",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(getApplicationContext(),"Data could not be inserted ",Toast.LENGTH_LONG).show();
        db.close();
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt3.clearFocus();
    }
}


