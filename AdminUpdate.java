package com.example.movieticketbooking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AdminUpdate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_update);
    }
    public void updateMovie(View view)
    {
        DBAdapter db = new DBAdapter(this);
        db.open();

        EditText txt1, txt2, txt3,txt4;
        String str1, str2,str3;
        String query = "";
        long rowId;

        txt1 = (EditText)findViewById(R.id.editText17);
        txt2 = (EditText)findViewById(R.id.editText18);
        txt3 =(EditText)findViewById(R.id.editText19);
        txt4 =(EditText)findViewById(R.id.editText21);


        str1 = txt2.getText().toString();
        str2 = txt3.getText().toString();
        str3 = txt4.getText().toString();

        query = txt1.getText().toString();
        rowId = Integer.parseInt(query);

        if (db.updateMovie(rowId, str1, str2,str3))
            Toast.makeText(this, "Update successful ", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Update failed ", Toast.LENGTH_LONG).show();
        db.close();
    }
}


