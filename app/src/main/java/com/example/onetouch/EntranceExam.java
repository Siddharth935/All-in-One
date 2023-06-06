package com.example.onetouch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.onetouch.Entrace.AdvanceJee;
import com.example.onetouch.Entrace.Cat;
import com.example.onetouch.Entrace.Gate;
import com.example.onetouch.Entrace.Jee;
import com.example.onetouch.Entrace.Neet;
import com.example.onetouch.Entrace.Upsc;
import com.example.onetouch.databinding.ActivityEntranceExamBinding;

public class EntranceExam extends AppCompatActivity {

    ActivityEntranceExamBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEntranceExamBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.jee.setOnClickListener(v -> {
            Intent intent = new Intent(EntranceExam.this, Jee.class);
            startActivity(intent);
        });

        binding.AdvanceJee.setOnClickListener(v -> {
            Intent intent = new Intent(EntranceExam.this, AdvanceJee.class);
            startActivity(intent);
        });

        binding.neet.setOnClickListener(v -> {
            Intent intent = new Intent(EntranceExam.this, Neet.class);
            startActivity(intent);
        });

        binding.upsc.setOnClickListener(v -> {
            Intent intent = new Intent(EntranceExam.this, Upsc.class);
            startActivity(intent);
        });

        binding.cat.setOnClickListener(v -> {
            Intent intent = new Intent(EntranceExam.this, Cat.class);
            startActivity(intent);
        });

        binding.gate.setOnClickListener(v -> {
            Intent intent = new Intent(EntranceExam.this, Gate.class);
            startActivity(intent);
        });
    }
}