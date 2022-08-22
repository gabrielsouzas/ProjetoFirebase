package com.gabriel.projetofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    private TextView text_tela_cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        // Esconde a barra que fica no topo com o titulo do projeto
        getSupportActionBar().hide();

        // Evento clique
        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Cria uma intenção para navegar até a tela de cadastro
                // Passa como parâmetro a tela atual.contexto e a tela que vai navegar
                Intent intent = new Intent(FormLogin.this, FormCadastro.class);

                // Inicia a intenção
                startActivity(intent);

            }
        });
    }

    private void iniciarComponentes(){
        // Pega o TextView pelo id e joga nessa variavel TextView
        text_tela_cadastro = findViewById(R.id.text_tela_cadastro);
    }
}