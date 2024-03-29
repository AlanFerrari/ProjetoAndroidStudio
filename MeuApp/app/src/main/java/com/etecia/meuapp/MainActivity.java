package com.etecia.meuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //variáveis globais que represetam os objetos no xml
    EditText edtUsuario, edtSenha;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //abrindo a minha activity
        setContentView(R.layout.activity_main);

        //declarei como variáveis do java para apresentar para as variáveis xml
        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);

        btnEntrar = findViewById(R.id.btnEntrar);

        //ação do botão entrar
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String usuario, senha;

                usuario = edtUsuario.getText().toString();
                senha = edtSenha.getText().toString();

                if (usuario.equals("etecia") && senha.equals("etecia")){
                    /*Toast.makeText(getApplicationContext(),
                            "Bem vido ao sistema!!!",
                            Toast.LENGTH_SHORT).show();*/

                    //abrir janela
                    startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                    finish();

                    Intent intent = new Intent(getApplicationContext(), MenuActivity.class);

                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(),
                            "Usuário ou senha inválido!!!",
                            Toast.LENGTH_SHORT).show();
                    edtUsuario.setText("");
                    edtSenha.setText("");
                    edtUsuario.requestFocus();
                }

            }
        });
    }

    public void sairSistema(View view) {
        finish(); //finalizando a activity
    }
}