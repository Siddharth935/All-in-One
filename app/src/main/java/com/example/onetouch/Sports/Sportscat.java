package com.example.onetouch.Sports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivitySportscatBinding;

public class Sportscat extends AppCompatActivity {

    ActivitySportscatBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySportscatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.icc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sportscat.this, iccCategories.class);
                startActivity(intent);
            }
        });
        binding.fifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sportscat.this, FIFA.class);
                startActivity(intent);
            }
        });
    }
}