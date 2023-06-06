package com.example.onetouch.NewsWebsite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.onetouch.News;
import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivityCtegariesNewsWebsiteBinding;

public class Ctegaries_news_website extends AppCompatActivity {

    ActivityCtegariesNewsWebsiteBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCtegariesNewsWebsiteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.Bbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ctegaries_news_website.this, BbcNews.class);
                startActivity(intent);
            }
        });

        binding.ZeeBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ctegaries_news_website.this, ZeeBuisness.class);
                startActivity(intent);
            }
        });

        binding.News24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ctegaries_news_website.this, News24.class);
                startActivity(intent);
            }
        });
        binding.RepublicTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ctegaries_news_website.this, RepublicTv.class);
                startActivity(intent);
            }
        });
        binding.ABPNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ctegaries_news_website.this, ABPNews.class);
                startActivity(intent);
            }
        });
        binding.AajTak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ctegaries_news_website.this, AajTak.class);
                startActivity(intent);
            }
        });
    }
}