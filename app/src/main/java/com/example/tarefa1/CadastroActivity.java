package com.example.tarefa1;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        EditText etNomeCompleto = findViewById(R.id.etNomeCompleto);
        EditText etEndereco = findViewById(R.id.etEndereco);
        EditText etNumero = findViewById(R.id.etNumero);
        EditText etCEP = findViewById(R.id.etCEP);
        EditText etComplemento = findViewById(R.id.etComplemento);
        EditText etEmail = findViewById(R.id.etEmail);
        Button btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etNomeCompleto.getText().toString()) ||
                        TextUtils.isEmpty(etEndereco.getText().toString()) ||
                        TextUtils.isEmpty(etNumero.getText().toString()) ||
                        TextUtils.isEmpty(etCEP.getText().toString()) ||
                        TextUtils.isEmpty(etComplemento.getText().toString()) ||
                        TextUtils.isEmpty(etEmail.getText().toString())) {
                    startActivity(new Intent(CadastroActivity.this, ErroCadastroActivity.class));
                } else {
                    startActivity(new Intent(CadastroActivity.this, SucessoCadastroActivity.class));
                }
            }
        });
    }
}
