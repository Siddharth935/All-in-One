package com.example.onetouch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.onetouch.databinding.ActivityInstaDownloaderBinding;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class InstaDownloader extends AppCompatActivity {


    ActivityInstaDownloaderBinding binding;
    InstaDownloader activity;

    String VideoUrl, video;
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInstaDownloaderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        activity =this;

        dialog = new ProgressDialog(this);
        dialog.setMessage("Please Wait...");
        dialog.setCancelable(false);


        binding.fbDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFaceBokkData();
            }
        });
    }

    private void getFaceBokkData() {
        URL url = null;
        try {
            url = new URL(binding.fbLink.getText().toString());
            String host = url.getHost();
            if (host.contains("facebook")){
                new CallgetFbData().execute(binding.fbLink.getText().toString());
            }else {
                Toast.makeText(this, "url Invalid", Toast.LENGTH_SHORT).show();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
    @SuppressLint("StaticFieldLeak")
    class CallgetFbData extends AsyncTask<String, Void, Document>{

        Document fbDoc;
        @Override
        protected Document doInBackground(String... strings) {
            try {
                fbDoc = Jsoup.connect(strings[0]).get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return fbDoc;
        }

        @Override
        protected void onPostExecute(Document document) {
            String videoUrl = document.select("meta[property=\"og:video\"]")
                    .last().attr("content");
            if (videoUrl.equals("")){
                utile.download(videoUrl, utile.RootDirectoryFaceBook, activity, "facebook "+System.currentTimeMillis()+".mp4");
            }
        }
    }


}