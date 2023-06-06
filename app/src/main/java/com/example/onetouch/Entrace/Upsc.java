package com.example.onetouch.Entrace;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.ablanco.zoomy.TapListener;
import com.ablanco.zoomy.Zoomy;
import com.example.onetouch.R;
import com.example.onetouch.databinding.ActivityNeetBinding;
import com.example.onetouch.databinding.ActivityUpscBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class Upsc extends AppCompatActivity {

    ActivityUpscBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUpscBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference UPSCImg = database.getReference("UPSCImg");
        DatabaseReference UPSCSyllabusIMG = database.getReference("UPSCSyllabusIMG");


        DatabaseReference UPSC1 = database.getReference("UPSC1");
        DatabaseReference UPSC2 = database.getReference("UPSC2");
        DatabaseReference UPSC3 = database.getReference("UPSC3");
        DatabaseReference UPSC4 = database.getReference("UPSC4");
        DatabaseReference UPSC5 = database.getReference("UPSC5");
        DatabaseReference UPSC6 = database.getReference("UPSC6");
        DatabaseReference UPSC7 = database.getReference("UPSC7");

        DatabaseReference UPSC21 = database.getReference("UPSC21");
        DatabaseReference UPSC22 = database.getReference("UPSC22");
        DatabaseReference UPSC23 = database.getReference("UPSC23");
        DatabaseReference UPSC24 = database.getReference("UPSC24");
        DatabaseReference UPSC25 = database.getReference("UPSC25");
        DatabaseReference UPSC26 = database.getReference("UPSC26");


        DatabaseReference UPSCLink = database.getReference("UPSCLink");
        DatabaseReference UPSCContent = database.getReference("UPSCContent");
        DatabaseReference UPSCYoutubeLink = database.getReference("UPSCYoutubeLink");
        DatabaseReference UPSCNews = database.getReference("UPSCNews");

        UPSCImg.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(binding.UPSCImg);
                Zoomy.Builder builder = new Zoomy.Builder(Upsc.this)
                        .target(binding.UPSCImg)
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
        UPSC1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSC1.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        UPSC2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSC2.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        UPSC3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSC3.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        UPSC4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSC4.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        UPSC5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSC5.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        UPSC6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSC6.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        UPSC7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSC7.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        UPSC21.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSC21.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        UPSC22.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSC22.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        UPSC23.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSC23.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        UPSC24.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSC24.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        UPSC25.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSC25.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        UPSC26.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSC26.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


        UPSCLink.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSCLink.setText(value);
//                binding.UPSCLink.setOnClickListener(new View.OnClickListener() {
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
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        UPSCContent.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSCContent.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        UPSCYoutubeLink.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSCYoutubeLink.setText(value);
                binding.UPSCYoutubeLink.setOnClickListener(v -> {
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
        UPSCNews.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                binding.UPSCNews.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                binding.UPSCProgressBar.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), "error" + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        UPSCSyllabusIMG.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                binding.UPSCProgressBar.setVisibility(View.GONE);
                String value = dataSnapshot.getValue(String.class);
                Picasso.get().load(value).into(binding.UPSCSyllabusIMG);
                Zoomy.Builder builder = new Zoomy.Builder(Upsc.this)
                        .target(binding.UPSCSyllabusIMG)
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