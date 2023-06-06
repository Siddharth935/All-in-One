package com.example.onetouch;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.widget.Toast;

public class utile {





    public static String RootDirectoryFaceBook = "/My Story Saver/ facebook";
    public static void download(String downloadpath, String destinationPath, Context context, String filename){
        Toast.makeText(context, "downloading start", Toast.LENGTH_SHORT).show();
        Uri uri = Uri.parse(downloadpath);
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setTitle("File Name");
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, destinationPath+filename );
        ((DownloadManager)context.getSystemService(context.DOWNLOAD_SERVICE)).enqueue(request);
    }
}
