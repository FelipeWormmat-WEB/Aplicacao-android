package com.example.tarefa1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class ErroCadastroActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erro_cadastro);

        TextView tvErro = findViewById(R.id.tvErro);
        Button btnVoltar = findViewById(R.id.btnVoltar);

        tvErro.setText("Erro no Cadastro. Os campos devem ser preenchidos.");

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ErroCadastroActivity.this, CadastroActivity.class));
            }
        });
    }
}
