package com.example.tarefa1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class SobreActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        TextView tvNomeAluno = findViewById(R.id.tvNomeAluno);
        Button btnUniFTEC = findViewById(R.id.btnUniFTEC);
        Button btnBoasVindas = findViewById(R.id.btnBoasVindas);

        tvNomeAluno.setText("Lewis Hamilton");

        btnUniFTEC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ftec.com.br/"));
                startActivity(browserIntent);
            }
        });

        btnBoasVindas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SobreActivity.this, BoasVindasActivity.class));
            }
        });
    }
}
