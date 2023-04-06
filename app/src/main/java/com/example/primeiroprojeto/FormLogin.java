package com.example.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
    }

    public void validaLogin (View view) {
        TextView texto = findViewById(R.id.textView);
        TextView usuario = findViewById(R.id.editUsuario);
        texto.setText(usuario.getText());
    }

}