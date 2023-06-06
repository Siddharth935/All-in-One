package com.example.onetouch.Sports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivityIccBinding;
import com.example.onetouch.databinding.ActivityIccCategoriesBinding;
import com.example.onetouch.webViews.BCC;
import com.example.onetouch.webViews.CA;
import com.example.onetouch.webViews.ECB;
import com.example.onetouch.webViews.PCB;
import com.example.onetouch.webViews.WI;

public class iccCategories extends AppCompatActivity {

    ActivityIccCategoriesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIccCategoriesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.BCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(iccCategories.this, BCC.class);
                startActivity(intent);
            }
        });binding.ECB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(iccCategories.this, ECB.class);
                startActivity(intent);
            }
        });binding.CA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(iccCategories.this, CA.class);
                startActivity(intent);
            }
        });binding.PCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(iccCategories.this, PCB.class);
                startActivity(intent);
            }
        });
        binding.WI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(iccCategories.this, WI.class);
                startActivity(intent);
            }
        });

    }
}