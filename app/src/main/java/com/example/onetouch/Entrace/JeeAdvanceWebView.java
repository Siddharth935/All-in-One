package com.example.onetouch.Entrace;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivityAdvanceJeeBinding;
import com.example.onetouch.databinding.ActivityJeeAdvanceWebViewBinding;
import com.example.onetouch.webViews.JeeWebActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class JeeAdvanceWebView extends AppCompatActivity {

    ActivityJeeAdvanceWebViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityJeeAdvanceWebViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference JeeAdvanceWebLink = database.getReference("JeeAdvanceLink");
        //jee Advance
        JeeAdvanceWebLink.addValueEventListener(new ValueEventListener() {
            @SuppressLint("SetJavaScriptEnabled")
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                binding.progressWebView.setVisibility(View.GONE);
                String webUrl = snapshot.getValue(String.class);

                binding.JeeAdvanceWebView.loadUrl(webUrl);
                binding.JeeAdvanceWebView.getSettings().setJavaScriptEnabled(true);
                binding.JeeAdvanceWebView.setWebViewClient(new WebViewClient());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.progressWebView.setVisibility(View.GONE);
                Toast.makeText(JeeAdvanceWebView.this, "Fail to get URL.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}