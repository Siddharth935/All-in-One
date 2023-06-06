package com.example.onetouch.NewsWebsite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.onetouch.News;
import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivityTypeOfNewsBinding;

public class TypeOfNews extends AppCompatActivity {

    ActivityTypeOfNewsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTypeOfNewsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.NewsArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOfNews.this, News.class);
                startActivity(intent);
            }
        });
        binding.Website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeOfNews.this, Ctegaries_news_website.class);
                startActivity(intent);
            }
        });

    }
}