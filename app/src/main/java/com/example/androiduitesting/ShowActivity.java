package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityNameView = findViewById(R.id.show_city_name);
        Button backButton = findViewById(R.id.show_activity_go_back);

        Intent intent = getIntent();
        if (intent != null) {
            String cityName = intent.getStringExtra("cityName");

            if (cityName != null) {
                cityNameView.setText(String.format("City Name: %s", cityName));
            }
        }

        backButton.setOnClickListener((v) -> {
            finish();
        });
    }
}

