package com.example.onetouch.Entrace;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ablanco.zoomy.Zoomy;
import com.example.onetouch.databinding.ActivityAdvanceJeeBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class AdvanceJee extends AppCompatActivity {


    ActivityAdvanceJeeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAdvanceJeeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference JeeAdvanceLink = database.getReference("JeeAdvanceLink");
        DatabaseReference JeeAdavanceContent = database.getReference("JeeAdavanceContent");
        DatabaseReference JeeAdvanceimg = database.getReference("JeeAdvanceimg");
        DatabaseReference youtubeVideoLink = database.getReference("JeeyoutubeVideoLink");
        DatabaseReference jeeMaths = database.getReference("JeeMaths");
        DatabaseReference jeeChemistry = database.getReference("JeeAdvanceChemistry");
        DatabaseReference jeePhysics = database.getReference("JeePhysics");
        DatabaseReference JeeAdvanceNews = database.getReference("JeeAdvanceNews");
        DatabaseReference jeeAdvancePhysicsWeightageImg = database.getReference("jeeAdvancePhysicsWeightageImg");
        DatabaseReference jeeAdvanceMathsWeightageImg = database.getReference("jeeAdvanceMathsWeightageImg");
        DatabaseReference jeeAdvanceChemistryWeightageImg = database.getReference("jeeAdvanceChemistryWeightageImg");


        //jee Link Connected to database
        JeeAdvanceLink.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                binding.JeeAdvanceLink.setText(value);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // Jee Content
        JeeAdavanceContent.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.JeeAdvanceContent.setText(value);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // Jee img
        JeeAdvanceimg.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(binding.jeeAdvanceImg);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        //Jee Youtube Link
        youtubeVideoLink.addValueEventListener(new ValueEventListener() {
            @SuppressLint("SetJavaScriptEnabled")
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.JeeAdvanceYtLink.setText(value);
                binding.JeeAdvanceYtLink.setOnClickListener(v -> {
                    binding.webJEEAdvance.loadUrl(value);
                    binding.webJEEAdvance.getSettings().setJavaScriptEnabled(true);
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });




        //jeeMaths
        jeeMaths.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                binding.JeeAdvanceMaths.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


        //jeePhysics
        jeePhysics.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                binding.JeeAdvancePhysics.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        //jeeChemistry
        jeeChemistry.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                binding.JeeAdvanceChemistry.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        //Jee News
        JeeAdvanceNews.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                binding.JeeAdvanceNews.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        //jee Official Website Like
        binding.JeeAdvanceLink.setOnClickListener(v -> {
            Intent intent = new Intent(AdvanceJee.this, JeeAdvanceWebView.class);
            startActivity(intent);
        });


        //jee advance syallbus
        jeeAdvancePhysicsWeightageImg.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(binding.jeeAdvancePhysicsWeightageImg);
                Zoomy.Builder builder = new Zoomy.Builder(AdvanceJee.this)
                        .target(binding.jeeAdvancePhysicsWeightageImg)
                        .animateZooming(true)
                        .enableImmersiveMode(false);
                builder.register();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        jeeAdvanceMathsWeightageImg.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(binding.jeeAdvanceMathsWeightageImg);
                Zoomy.Builder builder = new Zoomy.Builder(AdvanceJee.this)
                        .target(binding.jeeAdvanceMathsWeightageImg)
                        .animateZooming(true)
                        .enableImmersiveMode(false);
                builder.register();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        jeeAdvanceChemistryWeightageImg.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(binding.jeeAdvanceChemistryWeightageImg);
                Zoomy.Builder builder = new Zoomy.Builder(AdvanceJee.this)
                        .target(binding.jeeAdvanceChemistryWeightageImg)
                        .animateZooming(true)
                        .enableImmersiveMode(false);
                builder.register();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.JeeAdvanceProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}