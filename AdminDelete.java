package com.example.movieticketbooking;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AdminDelete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_delete);
    }
    public void displayMovie(View view) {
        DBAdapter db = new DBAdapter(this);
        db.open();
        Cursor c = db.getAllMovies();
        if (c.moveToFirst()) {
            do {
                display(c);
            } while (c.moveToNext());
        }
        db.close();
    }

    public void display(Cursor c)
    {
        Toast.makeText(this,
                "id: " + c.getString(0) + "\n" +
                        "Name: " + c.getString(1) + "\n" +
                        "Timings: " + c.getString(2) +"\n"+ "Language:" + c.getString(3),
                Toast.LENGTH_LONG).show();
    }
    public void deleteMovie(View view)
    {
        EditText txt =(EditText)findViewById(R.id.editText13);
        String query = "";
        long rowId;

        query = txt.getText().toString();
        rowId = Integer.parseInt(query);

        DBAdapter db = new DBAdapter(this);
        db.open();
        if (db.deleteMovie(rowId))
            Toast.makeText(this, "Delete successful.", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Delete failed.", Toast.LENGTH_LONG).show();
        db.close();
    }
}


