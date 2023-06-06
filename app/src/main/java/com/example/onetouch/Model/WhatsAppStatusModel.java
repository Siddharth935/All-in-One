package com.example.onetouch.Model;

import android.net.Uri;

public class WhatsAppStatusModel {
    private String name;
    private Uri uri;
    private String path;
    private String filname;

    public WhatsAppStatusModel(String name, Uri uri, String path, String filname) {
        this.name = name;
        this.uri = uri;
        this.path = path;
        this.filname = filname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFilname() {
        return filname;
    }

    public void setFilname(String filname) {
        this.filname = filname;
    }
}
