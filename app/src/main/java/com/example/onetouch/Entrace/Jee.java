package com.example.onetouch.Entrace;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ablanco.zoomy.Zoomy;
import com.example.onetouch.databinding.ActivityJeeBinding;
import com.example.onetouch.webViews.JeeWebActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;


public class Jee extends AppCompatActivity {

    ActivityJeeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityJeeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Link");
        DatabaseReference link = database.getReference("JeeContent");
        DatabaseReference img = database.getReference("JeeImg");
        DatabaseReference youtubeVideoLink = database.getReference("JeeyoutubeVideoLink");
        DatabaseReference jeeMaths = database.getReference("JeeMaths");
        DatabaseReference jeeChemistry = database.getReference("JeeChemistry");
        DatabaseReference jeePhysics = database.getReference("JeePhysics");
        DatabaseReference jeeNews = database.getReference("JeeNews");
        DatabaseReference jeeChemistryWeightageImg = database.getReference("jeeChemistryWeightageImg");
        DatabaseReference jeePhysicsWeightageImg = database.getReference("jeePhysicsWeightageImg");
        DatabaseReference jeeMathsWeightageImg = database.getReference("jeeMathsWeightageImg");


        // Jee Content
        link.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.progressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.text.setText(value);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.progressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


        //Jee Youtube Link
        youtubeVideoLink.addValueEventListener(new ValueEventListener() {
            @SuppressLint("SetJavaScriptEnabled")
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                binding.progressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.youtubeLink.setText(value);
                binding.youtubeLink.setOnClickListener(v -> {
                    binding.web.loadUrl(value);
                    binding.web.getSettings().setJavaScriptEnabled(true);
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.progressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // Jee img
        img.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.progressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(binding.jeeImg);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.progressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        //jee Link Connected to database
        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                binding.textView.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.progressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        //jeeMaths
        jeeMaths.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                binding.jeeMaths.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.progressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


        //jeePhysics
        jeePhysics.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                binding.jeePhysics.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.progressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        //jeeChemistry
        jeeChemistry.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                binding.jeeChemistry.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.progressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        //Jee News
        jeeNews.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                binding.jeeNews.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.progressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        //jee Official Website Like
        binding.textView.setOnClickListener(v -> {
            Intent intent = new Intent(Jee.this, JeeWebActivity.class);
            startActivity(intent);
        });


        //jee syallbus weightage
        jeePhysicsWeightageImg.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.progressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(binding.jeePhysicsWeightageImg);
                Zoomy.Builder builder = new Zoomy.Builder(Jee.this)
                        .target(binding.jeePhysicsWeightageImg)
                        .animateZooming(true)
                        .enableImmersiveMode(false);
                builder.register();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.progressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        jeeChemistryWeightageImg.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.progressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(binding.jeeChemistryWeightageImg);
                Zoomy.Builder builder = new Zoomy.Builder(Jee.this)
                        .target(binding.jeeChemistryWeightageImg)
                        .animateZooming(true)
                        .enableImmersiveMode(false);
                builder.register();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.progressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        jeeMathsWeightageImg.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.progressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(binding.jeeMathsWeightageImg);
                Zoomy.Builder builder = new Zoomy.Builder(Jee.this)
                        .target(binding.jeeMathsWeightageImg)
                        .animateZooming(true)
                        .enableImmersiveMode(false);
                builder.register();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.progressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}