package com.example.onetouch.webViews;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivityFranceBinding;

public class France extends AppCompatActivity {

    ActivityFranceBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFranceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        WebView webView = binding.webViewFrance;
        webView.loadUrl("https://www.fff.fr/");
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
    }
}