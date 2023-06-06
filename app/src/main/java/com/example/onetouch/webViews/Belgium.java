package com.example.onetouch.webViews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivityBelgiumBinding;

public class Belgium extends AppCompatActivity {

    ActivityBelgiumBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBelgiumBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        WebView webView = binding.webViewBelgium;
        webView.loadUrl("https://www.rbfa.be/en");
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
    }
}