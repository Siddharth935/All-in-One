package com.example.onetouch.NewsWebsite;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivityAajTakBinding;

public class AajTak extends AppCompatActivity {

    ActivityAajTakBinding binding;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAajTakBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        WebView webView = binding.webViewAajTak;
        webView.loadUrl("https://www.aajtak.in/");

        webView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
    }
}