package com.example.onetouch;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//import at.huber.youtubeExtractor.YouTubeUriExtractor;
//import at.huber.youtubeExtractor.YtFile;

public class VideoDownloder extends AppCompatActivity {

    EditText editText;
    Button btn;

    String downloadUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_downloder);

        editText = findViewById(R.id.ytLink);
        btn = findViewById(R.id.ytDownload);

//        YouTubeUriExtractor sidExtract = new YouTubeUriExtractor(VideoDownloder.this) {
//            @Override
//            public void onUrisAvailable(String s, String s1, SparseArray<YtFile> sparseArray) {
//                if (sparseArray != null) {
//                    int itag = 22;
//                    try {
//                        downloadUrl = sparseArray.get(itag).getUrl();
//
//                        if (downloadUrl != null) {
//                            Toast.makeText(VideoDownloder.this, "Download Started", Toast.LENGTH_SHORT).show();
//                            downloadVideo(downloadUrl);
//                            Log.d("Download Url", "URL :- " + downloadUrl);
//                        }
//                    } catch (Exception e) {
//                        Toast.makeText(VideoDownloder.this, "download url npt be fected", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            }
//        };
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String url = editText.getText().toString();
//
//                if (url!=null){
//                    sidExtract.extract(url);
//                }
//            }
//        });
    }

    void downloadVideo(String url) {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        request.setTitle("download");
        request.setDescription("Your file is downloading");
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(VideoDownloder.this, Environment.DIRECTORY_DOWNLOADS, "testing.mp4");

        DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);
    }
}