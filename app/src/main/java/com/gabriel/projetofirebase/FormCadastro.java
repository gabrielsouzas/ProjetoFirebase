package com.gabriel.projetofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        // Esconde a barra superior com o titulo do projeto
        getSupportActionBar().hide();
    }
}