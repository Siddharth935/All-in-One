package com.example.onetouch.webViews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivityPcbBinding;

public class PCB extends AppCompatActivity {

    ActivityPcbBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPcbBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        WebView webView = binding.webViewPCB;
        webView.loadUrl("https://www.pcb.com.pk/");
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
    }
}