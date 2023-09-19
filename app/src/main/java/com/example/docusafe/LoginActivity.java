package com.example.docusafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    private TextView usernameTV;
    private TextView passwordTV;
    private TextView forgotTV;
    private Button signInBtn;
    private TextView registerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Connect to views
        usernameTV = findViewById(R.id.usernameInput);
        passwordTV = findViewById(R.id.passwordInput);
        forgotTV = findViewById(R.id.forgetPasswordBtn);
        signInBtn = findViewById(R.id.signInBtn);
        registerTV = findViewById(R.id.registerLinking);

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if username and password is correct
                //then login the main interface
                //else create an error toast
            }
        });
    }
}