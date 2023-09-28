package com.example.myfirstapplication2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gomb = findViewById(R.id.btnGomb);
        EditText text = findViewById(R.id.edtSzoveg);

        gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gomb.setText("Barmi");
                Toast.makeText(MainActivity.this, "Valami", Toast.LENGTH_LONG).show();
                Log.d("Status:", "Hello!");
                text.setText("Hello Android!");

            }
        });

    }
}