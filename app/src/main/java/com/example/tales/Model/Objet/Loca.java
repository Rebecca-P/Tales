package com.example.tales.Model.Objet;
import com.google.gson.annotations.SerializedName;

public class Loca {

    @SerializedName("Image")
    private String image;
    @SerializedName("Lieu")
    private String lieu;
    @SerializedName("Des")
    private String des;
    @SerializedName("Supp")
    private String supp;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getSupp() {
        return supp;
    }

    public void setSupp(String supp) {
        this.supp = supp;
    }
}
