package com.example.ventaauto.Pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ventaauto.R;

public class Login extends AppCompatActivity {

    private EditText txtUsuario, txtClave;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        vincular();


        //evento ejecutado al presionar btn ingresar
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtUsuario.getText().toString().equals("marcos") && txtClave.getText().toString().equals("1234")){
                    pantallaPrincipal();
                    txtUsuario.setText("");
                    txtClave.setText("");
                }else {
                    Toast.makeText(Login.this, "Usuario o contraseña incorrectas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    //metodo vincula atributos de la clase con los objetos de la vista
    public void vincular(){
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtClave = (EditText) findViewById(R.id.txtClave);
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }

    //metodo para ir del login a la pantalla principal
    private void pantallaPrincipal(){
        Intent aPrincipal = new Intent(this, MainActivity.class);
        startActivity(aPrincipal);
    }
}