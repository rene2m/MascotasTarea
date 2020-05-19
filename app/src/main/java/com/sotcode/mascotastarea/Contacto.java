package com.sotcode.mascotastarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class Contacto extends AppCompatActivity {
   // ArrayList<Contacto> contactos;
    private TextInputEditText enter_name;
    private TextInputEditText enter_email;
    private TextInputEditText enter_description;
    private String name;
    private String email;
    private String description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        enter_name          =(TextInputEditText) findViewById(R.id.enter_name);
        enter_email         =(TextInputEditText) findViewById(R.id.enter_email);
        enter_description   =(TextInputEditText) findViewById(R.id.enter_description);
    }
    public void enviarComentario(View v ){
        String email =enter_email.getText().toString();
        Intent emailintent= new Intent((Intent.ACTION_SEND));
        emailintent.setData(Uri.parse("mailto:"));
        emailintent.putExtra(Intent.EXTRA_EMAIL,email);
        emailintent.setType("message/rfc822");
        startActivity(Intent.createChooser(emailintent,"email"));
    }
}
