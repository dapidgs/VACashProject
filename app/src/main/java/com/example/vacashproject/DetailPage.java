package com.example.vacashproject;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.example.vacashproject.item.GameItem;

public class DetailPage extends AppCompatActivity {

    private Button button;
    private TextView backBtn;
    EditText email, username;
    TextView itemName, itemPrice, itemDesc;
    ImageView itemImage;
    private ProgressBar remainder;
    TextView value;
    TextView plus, minus, total, price;
    int count = 0;
    int totalPayment = 0;
    String balance;

    //    Dialog Box
    TextView dialogMsg, closeDialog;
    RelativeLayout background;
    RelativeLayout dialog;

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

//        stepper
        plus = findViewById(R.id.increment);
        minus = findViewById(R.id.decrement);

//      diamonds information remainder
        remainder = findViewById(R.id.remainder);
        remainder.setMax(10000);
        remainder.setProgress(7777);

//      information needed for total payment
        value = findViewById(R.id.quantity);
        price = findViewById(R.id.itemPrice);
        total = findViewById(R.id.totalPay);

        price.setText("10000");
        value.setText("0");
        total.setText("IDR 0");

//        dialogBox
        background = findViewById(R.id.bgDialog);
        dialog = findViewById(R.id.dialog);
        dialogMsg = findViewById(R.id.error);
        closeDialog = findViewById(R.id.closeBtn);

        background.setVisibility(View.INVISIBLE);
        dialog.setVisibility(View.INVISIBLE);
        dialogMsg.setText("");

        backBtn.setOnClickListener(v -> finish());

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String price_check = price.getText().toString();
                int price_now = Integer.parseInt(price_check);

                count++;
                totalPayment = count * price_now;
                value.setText("" + count);
                total.setText("IDR "+totalPayment);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String price_check = price.getText().toString();
                int price_now = Integer.parseInt(price_check);

                if(count <= 0) {
                    count = 0;
                }
                else {
                    count--;
                }
                totalPayment = count * price_now;
                value.setText("" + count);
                total.setText("IDR "+totalPayment);
            }
        });

        button.setOnClickListener(v -> {
            String email_check = email.getText().toString();
            String username_check = username.getText().toString();
            String value_to_string = value.getText().toString();
            int value_check = Integer.parseInt(value_to_string);
            balance = getIntent().getStringExtra("balance");
            int balance_check = Integer.parseInt(balance);

            if(email_check.isEmpty()){
//                openDialog("Please enter your email");
                dialogMsg.setText("Please enter your email");
                background.setVisibility(View.VISIBLE);
                dialog.setVisibility(View.VISIBLE);
            } else if (username_check.isEmpty()) {
//                openDialog("Please enter your username");
                dialogMsg.setText("Please enter your username");
                background.setVisibility(View.VISIBLE);
                dialog.setVisibility(View.VISIBLE);
            } else if (!email_check.contains("@")) {
//                openDialog("Email must contain '@'");
                dialogMsg.setText("Email must contain '@'");
                background.setVisibility(View.VISIBLE);
                dialog.setVisibility(View.VISIBLE);
            } else if (!email_check.contains(".com")) {
//                openDialog("Email must contain '.com'");
                dialogMsg.setText("Email must contain '.com'");
                background.setVisibility(View.VISIBLE);
                dialog.setVisibility(View.VISIBLE);
            } else if(value_check <= 0){
                dialogMsg.setText("Quantity must be greater than 0");
                background.setVisibility(View.VISIBLE);
                dialog.setVisibility(View.VISIBLE);
            }else if(balance_check > totalPayment){
                dialogMsg.setText("Your balance is not enough");
                background.setVisibility(View.VISIBLE);
                dialog.setVisibility(View.VISIBLE);
            }else{

            }
//            kurang validasi untuk total payment <= account's ballance
        });

        closeDialog.setOnClickListener(v -> {
            background.setVisibility(View.INVISIBLE);
            dialog.setVisibility(View.INVISIBLE);
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