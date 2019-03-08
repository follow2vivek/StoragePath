package com.follow2vivek.storagepath;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Vivek Sharma - @follow2vivek on 07-Mar-19.
 */
public class FileMetaData {

    @SerializedName("path")
    @Expose
    String data;
    @SerializedName("displayName")
    @Expose
    String displayName;
    @SerializedName("mimeType")
    @Expose
    String mimeType;
    @SerializedName("size")
    @Expose
    String size;
    @SerializedName("title")
    @Expose
    String title;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
