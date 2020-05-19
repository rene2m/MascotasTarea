package com.sotcode.mascotastarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Acercade extends AppCompatActivity {
 private TextView nombre_bio;
 private TextView name;
 private TextView nacimiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
        nombre_bio =(TextView) findViewById(R.id.text_nmbre_biogra);
      name = (TextView) findViewById(R.id.text_nombre);
      nacimiento = (TextView) findViewById(R.id.text_nacimiento);
    }
}
