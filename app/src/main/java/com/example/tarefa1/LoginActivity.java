package com.example.tarefa1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
public class LoginActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText etEmail = findViewById(R.id.etEmail);
        EditText etSenha = findViewById(R.id.etSenha);
        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etEmail.getText().toString();
                String senha = etSenha.getText().toString();

                if (email.equals("lewis.hamilton44@naosei.com") && senha.equals("tasussa")) {
                    startActivity(new Intent(LoginActivity.this, SucessoLoginActivity.class));
                } else {
                    startActivity(new Intent(LoginActivity.this, ErroLoginActivity.class));
                }
            }
        });
    }
}
