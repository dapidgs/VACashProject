package com.example.vacashproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private Button button;
    EditText email, password;
    TextView msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = findViewById(R.id.loginBtn);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        msg = findViewById(R.id.errorMsg);
        msg.setVisibility(View.INVISIBLE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email_check = email.getText().toString();
                String password_check = password.getText().toString();

                if(email_check.isEmpty()){
                    msg.setText("Email can not be empty");
                    msg.setVisibility(View.VISIBLE);
                }
                else if(!email_check.endsWith(".com")){
                    msg.setText("Email have to ends with '.com'");
                    msg.setVisibility(View.VISIBLE);
                }
                else if(!email_check.contains("@")){
                    msg.setText("Email have to contains '@'");
                    msg.setVisibility(View.VISIBLE);
                }
                else if(password_check.isEmpty()){
                    msg.setText("Password can not be empty");
                    msg.setVisibility(View.VISIBLE);
                }
                else if(password_check.length() <= 8){
                    msg.setText("Password must be more than 8 characters");
                    msg.setVisibility(View.VISIBLE);
                }
                else {
                    Intent loginIntent = new Intent(Login.this, HomePage.class);
                    loginIntent.putExtra("email", email_check);
                    startActivity(loginIntent);
                }
            }
        });

    }
}