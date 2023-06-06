package com.example.onetouch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.onetouch.databinding.ActivityCategoriesOfSocialMediaBinding;

public class  CategoriesOfSocialMedia extends AppCompatActivity {

    ActivityCategoriesOfSocialMediaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCategoriesOfSocialMediaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.YoutubeVideoDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoriesOfSocialMedia.this, VideoDownloder.class);
                startActivity(intent);
            }
        });

//        binding.whatsAppSaver.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(CategoriesOfSocialMedia.this, WhatsAppStautsSaver.class);
//                startActivity(intent);
//            }
//        });
    }
}