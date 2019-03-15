package com.example.tales.Objet;
import com.google.gson.annotations.SerializedName;

public class Synopsis {


    @SerializedName("Image")
    private String image;
    @SerializedName("Titre")
    private String titre;
    @SerializedName("Synop")
    private String synop;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSynop() {
        return synop;
    }

    public void setSynop(String synop) {
        this.synop = synop;
    }
}
