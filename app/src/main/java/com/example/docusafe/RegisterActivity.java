package com.example.docusafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    private EditText usernameED;
    private EditText numberPhoneED;
    private EditText passwordED;
    private EditText confirmPasswordED;
    private Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usernameED = findViewById(R.id.usernameInput);
        passwordED =  findViewById(R.id.passwordInput);
        numberPhoneED = findViewById(R.id.numberPhone);
        confirmPasswordED = findViewById(R.id.confirmPassword);
        nextBtn = findViewById(R.id.nextBtn);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, ValidationActivity.class));
            }
        });
    }
}