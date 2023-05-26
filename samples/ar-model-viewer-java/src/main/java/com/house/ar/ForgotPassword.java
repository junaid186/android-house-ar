package com.house.ar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ForgotPassword extends AppCompatActivity {


    EditText email;
    Button btnforgotPassword;
    String emailData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        getData();
    }

    private void getData() {
        email = findViewById(R.id.email);
        btnforgotPassword = findViewById(R.id.forgot_password_btn);
        emailData = email.getText().toString();
    }


    public void NavigateToLogin(View view) {
        Intent intent = new Intent(ForgotPassword.this, LoginActivity.class);
        startActivity(intent);
    }
}