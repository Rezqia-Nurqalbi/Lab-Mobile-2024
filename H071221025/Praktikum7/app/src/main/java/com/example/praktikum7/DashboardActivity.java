package com.example.praktikum7;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class DashboardActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    Button buttonLogout,buttonSettings;
    TextView textViewWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        textViewWelcome = findViewById(R.id.textViewWelcome);
        buttonLogout = findViewById(R.id.buttonLogout);
        buttonSettings = findViewById(R.id.buttonSettings);

        String nim = sharedPreferences.getString("NIM", "");
        textViewWelcome.setText("Selamat Datang " + nim);

//        int currentNightMode = getResources().getConfiguration().uiMode & android.content.res.Configuration.UI_MODE_NIGHT_MASK;
//        if (currentNightMode == android.content.res.Configuration.UI_MODE_NIGHT_YES) {
//            textViewWelcome.setTextColor(ContextCompat.getColor(DashboardActivity.this, R.color.white));
//        } else {
//            textViewWelcome.setTextColor(ContextCompat.getColor(DashboardActivity.this, R.color.black));
//        }

        buttonLogout.setOnClickListener(v -> {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("isLoggedIn", false);
            editor.apply();

            startActivity(new Intent(DashboardActivity.this, MainActivity.class));
            finish();
        });

        buttonSettings.setOnClickListener(v -> startActivity(new Intent(DashboardActivity.this, SettingsActivity.class)));

    }
}
