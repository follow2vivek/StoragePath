package com.follow2vivek.storagepath;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Vivek Sharma - @follow2vivek on 07-Mar-19.
 */
public class MediaModel {


    @SerializedName("folderName")
    @Expose
    String folder;
    @SerializedName("files")
    @Expose
    ArrayList<MetaData> files;


    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public ArrayList<MetaData> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<MetaData> files) {
        this.files = files;
    }

}

