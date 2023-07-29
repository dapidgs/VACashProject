package com.example.vacashproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class detail extends AppCompatActivity {

    private Button button;
    TextView plus, minus, total, price;
    EditText email, username;
    private ProgressBar remainder;
    TextView value;
    int count = 0;
    int totalPayment = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

//      submit button
        button = findViewById(R.id.buyBtn);

//      stepper
        plus = findViewById(R.id.increment);
        minus = findViewById(R.id.decrement);

//      input email & username
        email = findViewById(R.id.email);
        username = findViewById(R.id.username);

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
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
            }


        });


    }
    public void openDialog(String message){
        AlertDialog dialog = new AlertDialog.Builder(detail.this)
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