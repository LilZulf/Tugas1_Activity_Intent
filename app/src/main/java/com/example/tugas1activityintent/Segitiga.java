package com.example.tugas1activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Segitiga extends AppCompatActivity {
    double a,t,luas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        final EditText alas = (EditText) findViewById(R.id.etAlas);
        final EditText tinggi = (EditText) findViewById(R.id.etTinggi);
        final EditText hasil = (EditText) findViewById(R.id.etHasil);
        final Button hitung = (Button) findViewById(R.id.btHitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(alas.getText().toString());
                t = Double.parseDouble(tinggi.getText().toString());
                luas = a * t * 0.5;
                hasil.setText(String.valueOf(luas));
            }
        });
    }
}