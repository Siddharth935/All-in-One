package com.example.onetouch.Entrace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.onetouch.EntranceExam;
import com.example.onetouch.databinding.ActivityAcademicsBinding;

public class Academics extends AppCompatActivity {

    ActivityAcademicsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAcademicsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.entranceExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Academics.this, EntranceExam.class);
                startActivity(intent);
            }
        });
        binding.higherEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Academics.this, HigherEducation.class);
                startActivity(intent);
            }
        });
    }
}