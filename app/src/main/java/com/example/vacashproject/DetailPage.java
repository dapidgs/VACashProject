package com.example.vacashproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vacashproject.item.GameItem;

public class DetailPage extends AppCompatActivity {

    private Button button;
    private TextView backBtn;
    EditText email, username;

    TextView itemName, itemPrice, itemDesc;

    ImageView itemImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent fromItem = getIntent();
        System.out.println();
        if (fromItem != null) {
            GameItem gameItem = (GameItem) fromItem.getSerializableExtra("item");
            itemName = findViewById(R.id.itemName);
            itemPrice = findViewById(R.id.itemPrice);
            itemImage = findViewById(R.id.imageView);
            itemDesc = findViewById(R.id.itemDesc);

            itemName.setText(gameItem.getName());
            itemPrice.setText("IDR " + gameItem.getPrice());
            itemImage.setImageResource(gameItem.getImage());
            itemDesc.setText(gameItem.getDescription());

        }

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