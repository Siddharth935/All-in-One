package com.example.onetouch.NewsWebsite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivityNews24Binding;

public class News24 extends AppCompatActivity {

    ActivityNews24Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNews24Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        WebView webView = binding.webviewNews24;
        webView.loadUrl("https://news24online.com/");
        webView.setWebViewClient(new WebViewClient());

//        webView.setWebChromeClient(new WebChromeClient());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);

    }
}