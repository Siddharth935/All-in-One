package com.example.onetouch;

import android.os.Environment;

import java.io.File;

public class Util {
    public static File RootDirectoryWhatsApp = new File(Environment.getExternalStorageDirectory()
            + "/Download/MyStorySaver/WhatsApp");

    public static void createFolder() {
        if (!RootDirectoryWhatsApp.exists())
            RootDirectoryWhatsApp.mkdirs();
    }
}
