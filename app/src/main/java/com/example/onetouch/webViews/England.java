package com.example.onetouch.webViews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivityEnglandBinding;

public class England extends AppCompatActivity {
    
    ActivityEnglandBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnglandBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        WebView webView = binding.webViewEngland;
        webView.loadUrl("https://www.thefa.com/");
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
    }
}