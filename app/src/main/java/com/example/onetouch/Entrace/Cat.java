package com.example.onetouch.Entrace;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ablanco.zoomy.Zoomy;
import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivityCatBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class Cat extends AppCompatActivity {

    ActivityCatBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        DatabaseReference CATIMAG = database.getReference("CATIMAG");
        DatabaseReference CATWEBSITELINK = database.getReference("CATWEBSITELINK");
        DatabaseReference CATCONTENT = database.getReference("CATCONTENT");
        DatabaseReference CATYOUTUBELINK = database.getReference("CATYOUTUBELINK");
        DatabaseReference CATNEWS = database.getReference("CATNEWS");
        DatabaseReference CATSYLLABUS = database.getReference("CATSYLLABUS");

        CATIMAG.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(binding.CATImg);
                Zoomy.Builder builder = new Zoomy.Builder(Cat.this)
                        .target(binding.CATImg)
                        .animateZooming(true)
                        .enableImmersiveMode(false);
                builder.register();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        CATWEBSITELINK.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.CATLink.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        CATCONTENT.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.CATContent.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        CATYOUTUBELINK.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.CATYoutubeLink.setText(value);
                binding.CATYoutubeLink.setOnClickListener(v -> {
                    binding.web.loadUrl(value);
                    binding.web.getSettings().setJavaScriptEnabled(true);
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        CATNEWS.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.CATNews.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        CATSYLLABUS.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(binding.CATSyllabusIMG);
                Zoomy.Builder builder = new Zoomy.Builder(Cat.this)
                        .target(binding.CATSyllabusIMG)
                        .animateZooming(true)
                        .enableImmersiveMode(false);
                builder.register();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}