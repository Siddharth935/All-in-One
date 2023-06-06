package com.example.onetouch.Entrace;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.ablanco.zoomy.Zoomy;
import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivityNeetBinding;
import com.example.onetouch.webViews.JeeWebActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class Neet extends AppCompatActivity {

    ActivityNeetBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNeetBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference NeetLink = database.getReference("NeetLink");
        DatabaseReference NeetContent = database.getReference("NeetContent");
        DatabaseReference Neetimg = database.getReference("NeetImg");
        DatabaseReference NeetYoutubeVideoLink = database.getReference("NeetyoutubeVideoLink");
        DatabaseReference NeetBiology = database.getReference("NeetBiology");
        DatabaseReference NeetChemistry = database.getReference("NeetChemistry");
        DatabaseReference NeetPhysics = database.getReference("NeetPhysics");
        DatabaseReference NeetNews = database.getReference("NeetNews");
        DatabaseReference neetPhysicsWeightageImg = database.getReference("neetPhysicsWeightageImg");
        DatabaseReference NeetBiologyWeightageImg = database.getReference("NeetBiologyWeightageImg");
        DatabaseReference neetChemistryWeightageImg = database.getReference("neetChemistryWeightageImg");

        //jee Link Connected to database
        NeetLink.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                binding.NeetLink.setText(value);
//                binding.NeetLink.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        binding.web.loadUrl(value);
//                        binding.web.getSettings().setJavaScriptEnabled(true);
//                        binding.web.setWebViewClient(new WebViewClient());
//                    }
//                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.NeetProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        NeetContent.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.NeetProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.NeetContent.setText(value);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.NeetProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        Neetimg.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.NeetProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(binding.NeetImg);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.NeetProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        neetPhysicsWeightageImg.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.NeetProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(binding.neetPhysicsWeightageImg);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.NeetProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        neetChemistryWeightageImg.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.NeetProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(binding.neetChemistryWeightageImg);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.NeetProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        NeetBiologyWeightageImg.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.NeetProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(binding.NeetBiologyWeightageImg);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.NeetProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


        NeetYoutubeVideoLink.addValueEventListener(new ValueEventListener() {
            @SuppressLint("SetJavaScriptEnabled")
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                binding.NeetProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.NeetYoutubeLink.setText(value);
                binding.NeetYoutubeLink.setOnClickListener(v -> {
                    binding.web.loadUrl(value);
                    binding.web.getSettings().setJavaScriptEnabled(true);
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.NeetProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        NeetBiology.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                binding.NeetBiology.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.NeetProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


        NeetPhysics.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                binding.NeetPhysics.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.NeetProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        NeetChemistry.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                binding.NeetChemistry.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.NeetProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        NeetNews.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                binding.NeetNews.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.NeetProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        binding.NeetLink.setOnClickListener(v -> {
            Intent intent = new Intent(Neet.this, JeeWebActivity.class);
            startActivity(intent);
        });
    }
}