package com.example.tales.Model.Objet;
import com.google.gson.annotations.SerializedName;

public class Equipement_item {

    @SerializedName("Icon")
    private String url_img;
    @SerializedName("Nom")
    private String name_equ;
    @SerializedName("Description")
    private String description_equ;
    @SerializedName("Presonnage")
    private String url_perso;
    @SerializedName("Capacite")
    private String capacite;
    @SerializedName("Prix_Lieux")
    private String prix_lieux;
    @SerializedName("Stat")
    private String stat;
    @SerializedName("Synthese1")
    private String syn1;
    @SerializedName("Synthese2")
    private String syn2;

    public String getUrl_img() {
        return url_img;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }

    public String getName_equ() {
        return name_equ;
    }

    public void setName_equ(String name_equ) {
        this.name_equ = name_equ;
    }

    public String getDescription_equ() {
        return description_equ;
    }

    public void setDescription_equ(String description_equ) {
        this.description_equ = description_equ;
    }

    public String getUrl_perso() {
        return url_perso;
    }

    public void setUrl_perso(String url_perso) {
        this.url_perso = url_perso;
    }

    public String getCapacite() {
        return capacite;
    }

    public void setCapacite(String capacite) {
        this.capacite = capacite;
    }

    public String getPrix_lieux() {
        return prix_lieux;
    }

    public void setPrix_lieux(String prix_lieux) {
        this.prix_lieux = prix_lieux;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getSyn1() {
        return syn1;
    }

    public void setSyn1(String syn1) {
        this.syn1 = syn1;
    }

    public String getSyn2() {
        return syn2;
    }

    public void setSyn2(String syn2) {
        this.syn2 = syn2;
    }
}
