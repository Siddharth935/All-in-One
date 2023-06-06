package com.example.onetouch.webViews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivityWiBinding;

public class WI extends AppCompatActivity {

    ActivityWiBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = ActivityWiBinding.inflate(getLayoutInflater());
       setContentView(binding.getRoot());

        WebView webView = binding.webViewWI;
        webView.loadUrl("https://www.windiescricket.com/");
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
    }
}