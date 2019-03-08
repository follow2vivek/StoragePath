package com.follow2vivek.storagepath;

import java.io.Serializable;
import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by Vivek Sharma - @follow2vivek on 06-Mar-19.
 */
class FileModel implements Serializable {

    @SerializedName("folderName")
    @Expose
    String folder;

    @SerializedName("files")
    @Expose
    ArrayList<String> files;

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public ArrayList<String> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<String> files) {
        this.files = files;
    }
}
