package com.wahyurhy.multipleuploadimages;

import android.net.Uri;

public class ModalClass {

    String imageName;
    Uri image;

    public ModalClass() {

    }

    public ModalClass(String imageName, Uri image) {
        this.imageName = imageName;
        this.image = image;
    }

    public Uri getImage() {
        return image;
    }

    public void setImage(Uri image) {
        this.image = image;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
