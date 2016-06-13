package com.example.pankajkatiyar.login2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText txtEmail = (EditText)findViewById(R.id.txtEmail);
        final EditText txtPass = (EditText)findViewById(R.id.txtPassword);
        Button btnLogin = (Button)findViewById(R.id.btnLogin);
        
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtEmail.getText().toString().isEmpty()|| txtEmail.getText().toString().equals("Email")){
                    Toast.makeText(MainActivity.this, "Please Enter Email ID", Toast.LENGTH_SHORT).show();
                }else if(txtPass.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Login Parameters are okay", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
