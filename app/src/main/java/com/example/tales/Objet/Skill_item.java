package com.example.tales.Objet;
import com.google.gson.annotations.SerializedName;

public class Skill_item {


    @SerializedName("Icon")
    private String icon;
    @SerializedName("Name")
    private String name;
    @SerializedName("Description EN")
    private String description;
    @SerializedName("Perso")
    private String perso;
    @SerializedName("Info")
    private String info;


    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPerso() {
        return perso;
    }

    public void setPerso(String perso) {
        this.perso = perso;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
