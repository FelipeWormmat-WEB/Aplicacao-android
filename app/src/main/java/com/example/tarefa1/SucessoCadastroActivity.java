package com.example.tarefa1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SucessoCadastroActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucesso_cadastro);

        TextView tvSucesso = findViewById(R.id.tvSucesso);
        Button btnSobre = findViewById(R.id.btnSobre);

        String nome = getIntent().getStringExtra("nome");
        tvSucesso.setText("Olá " + nome + ". Cadastro realizado com sucesso");

        btnSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SucessoCadastroActivity.this, SobreActivity.class));
            }
        });
    }
}
