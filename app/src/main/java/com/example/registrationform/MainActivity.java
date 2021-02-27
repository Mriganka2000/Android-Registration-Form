package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterBtnClick(View view) {
        EditText edtFirstName = findViewById(R.id.edtFirstName);
        String fname = edtFirstName.getText().toString();
        EditText edtLastName = findViewById(R.id.edtLastName);
        String lname = edtLastName.getText().toString();
        EditText edtEmail = findViewById(R.id.edtEmail);
        String emailaddress = edtEmail.getText().toString();

        TextView firstName = findViewById(R.id.firstName);
        firstName.setText(fname);
        TextView lastName = findViewById(R.id.lastName);
        lastName.setText(lname);
        TextView email = findViewById(R.id.email);
        email.setText(emailaddress);
    }
}