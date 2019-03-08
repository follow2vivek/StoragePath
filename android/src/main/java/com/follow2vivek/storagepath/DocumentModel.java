package com.follow2vivek.storagepath;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Vivek Sharma - @follow2vivek on 07-Mar-19.
 */
public class DocumentModel {

    @SerializedName("folderName")
    @Expose
    String folderName;
    @SerializedName("files")
    @Expose
    ArrayList<FileMetaData> fileMetaData;

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public ArrayList<FileMetaData> getFileMetaData() {
        return fileMetaData;
    }

    public void setFileMetaData(ArrayList<FileMetaData> fileMetaData) {
        this.fileMetaData = fileMetaData;
    }
}
