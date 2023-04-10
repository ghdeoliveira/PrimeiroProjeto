package com.example.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto (View view) {
        TextView texto = findViewById(R.id.textView);
        TextView nomeNovo = findViewById(R.id.editTextTextPersonName);
        texto.setText(nomeNovo.getText());
    }
}