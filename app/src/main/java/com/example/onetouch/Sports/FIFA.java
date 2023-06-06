package com.example.onetouch.Sports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivityFifaBinding;
import com.example.onetouch.webViews.Argentina;
import com.example.onetouch.webViews.Belgium;
import com.example.onetouch.webViews.Brazil;
import com.example.onetouch.webViews.England;
import com.example.onetouch.webViews.France;

public class FIFA extends AppCompatActivity {

    ActivityFifaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFifaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.Argentina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FIFA.this, Argentina.class);
                startActivity(intent);
            }
        });
        binding.Belgium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FIFA.this, Belgium.class);
                startActivity(intent);
            }
        });
        binding.Brazil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FIFA.this, Brazil.class);
                startActivity(intent);
            }
        });
        binding.England.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FIFA.this, England.class);
                startActivity(intent);
            }
        });
        binding.France.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FIFA.this, France.class);
                startActivity(intent);
            }
        });
    }
}