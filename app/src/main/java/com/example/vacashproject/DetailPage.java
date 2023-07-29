package com.example.vacashproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DetailPage extends AppCompatActivity {

    private Button button;
    private TextView backBtn;
    EditText email, username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent fromItem = getIntent();

        button = findViewById(R.id.buyBtn);
        email = findViewById(R.id.email);
        username = findViewById(R.id.username);
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(v -> finish());
        button.setOnClickListener(v -> {
            String email_check = email.getText().toString();
            String username_check = username.getText().toString();
            if(email_check.isEmpty()){
                openDialog("Please enter your email");
            } else if (username_check.isEmpty()) {
                openDialog("Please enter your username");
            } else if (!email_check.contains("@")) {
                openDialog("Email must contain '@'");
            } else if (!email_check.contains(".com")) {
                openDialog("Email must contain '.com'");
            }
        });
    }
    public void openDialog(String message){
        AlertDialog dialog = new AlertDialog.Builder(DetailPage.this)
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();
                    }
                }).create();
        dialog.show();
    }
}