package com.example.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class FormLogin extends AppCompatActivity {

    private EditText editUsuario, editSenha;
    private Button bt_validar;
    String[] mensagens = {"Preencha todos os campos!","Login validado!","Login recusado"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);
        iniciarComponentes();

        getSupportActionBar().hide();

        bt_validar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String usuario = editUsuario.getText().toString();
                String senha = editSenha.getText().toString();



                if (usuario.isEmpty() || senha.isEmpty()) {
                    Snackbar snackbar = Snackbar.make(view, mensagens[0], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                }
                else {
                    validaLogin();
                }
            }
        });
    }

    public void iniciarComponentes () {
        editUsuario = findViewById(R.id.editUsuario);
        editSenha = findViewById(R.id.editSenha);
        bt_validar = findViewById(R.id.bt_validar);
    }

    public void validaLogin () {

        String usuario = "gabriel";
        String senha = "123";

        TextView texto = findViewById(R.id.aviso);

        String validaUsuario = editUsuario.getText().toString();
        String validaSenha = editSenha.getText().toString();

        if (usuario.equals(validaUsuario) && senha.equals(validaSenha)) {
            texto.setText("Login Efetuado!");
        }
        else {
            texto.setText("Login Recusado!");
        }
    }

}