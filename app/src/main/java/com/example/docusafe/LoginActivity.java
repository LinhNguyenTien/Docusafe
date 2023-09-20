package com.example.docusafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    private EditText usernameET;
    private EditText passwordET;
    private TextView forgotTV;
    private Button signInBtn;
    private TextView registerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Connect to views
        usernameET = findViewById(R.id.usernameInput);
        passwordET = findViewById(R.id.passwordInput);
        forgotTV = findViewById(R.id.forgetPasswordBtn);
        signInBtn = findViewById(R.id.signInBtn);
        registerTV = findViewById(R.id.registerLinking);

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if username and password is correct
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                //else create an error toast
            }
        });
    }
}