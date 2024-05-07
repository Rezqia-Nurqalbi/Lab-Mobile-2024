package com.example.praktikum7;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText editTextNIM, editTextPassword;
    Button buttonRegisterUser;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        editTextNIM = findViewById(R.id.editTextNIMRegister);
        editTextPassword = findViewById(R.id.editTextPasswordRegister);

        buttonRegisterUser = findViewById(R.id.buttonRegisterUser);

        buttonRegisterUser.setOnClickListener(v -> {
            String nim = editTextNIM.getText().toString();
            String password = editTextPassword.getText().toString();

            if (nim.isEmpty()) {
                editTextNIM.setError("NIM tidak boleh kosong");
                return;
            }
            if (password.isEmpty()) {
                editTextPassword.setError("Password tidak boleh kosong");
                return;
            }

            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("NIM", nim);
            editor.putString("Password", password);
            editor.apply();

            Toast.makeText(RegisterActivity.this, "Berhasil register", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(RegisterActivity.this, MainActivity.class));
            finish();
        });
    }
}
