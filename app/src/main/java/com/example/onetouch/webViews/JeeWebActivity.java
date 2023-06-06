package com.example.onetouch.webViews;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.example.onetouch.databinding.ActivityWebBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class JeeWebActivity extends AppCompatActivity {

    ActivityWebBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWebBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference webLink = database.getReference("Link");

        DatabaseReference NeetLink = database.getReference("NeetLink");

        //Jee
        webLink.addValueEventListener(new ValueEventListener() {
            @SuppressLint("SetJavaScriptEnabled")
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                binding.progressWebView.setVisibility(View.GONE);
                String webUrl = snapshot.getValue(String.class);

                binding.JeeWebView.loadUrl(webUrl);
                binding.JeeWebView.getSettings().setJavaScriptEnabled(true);
                binding.JeeWebView.setWebViewClient(new WebViewClient());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.progressWebView.setVisibility(View.GONE);
                Toast.makeText(JeeWebActivity.this, "Fail to get URL.", Toast.LENGTH_SHORT).show();
            }
        });


//        NeetLink.addValueEventListener(new ValueEventListener() {
//            @SuppressLint("SetJavaScriptEnabled")
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                binding.progressWebView.setVisibility(View.GONE);
//                String webUrl = snapshot.getValue(String.class);
//
//                binding.WebView.loadUrl(webUrl);
//                binding.WebView.getSettings().setJavaScriptEnabled(true);
//                binding.WebView.setWebViewClient(new WebViewClient());
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//                binding.progressWebView.setVisibility(View.GONE);
//                Toast.makeText(JeeWebActivity.this, "Fail to get URL.", Toast.LENGTH_SHORT).show();
//            }
//        });

    }

}