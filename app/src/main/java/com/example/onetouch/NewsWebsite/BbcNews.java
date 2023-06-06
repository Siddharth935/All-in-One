package com.example.onetouch.NewsWebsite;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivityBbcBinding;

public class BbcNews extends AppCompatActivity {

    ActivityBbcBinding binding;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBbcBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.webViewBBC.loadUrl("https://www.bbc.com/news");
        binding.webViewBBC.setWebViewClient(new WebViewClient());

        WebSettings webSettings = binding.webViewBBC.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
    }
}