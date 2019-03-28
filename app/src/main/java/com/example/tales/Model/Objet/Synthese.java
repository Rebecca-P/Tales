package com.example.tales.Model.Objet;
import com.google.gson.annotations.SerializedName;

public class Synthese {


    @SerializedName("Icon")
    private String icon;
    @SerializedName("Name")
    private String name;
    @SerializedName("Description")
    private String description;
    @SerializedName("Dropped")
    private String dropped;
    @SerializedName("Stolen")
    private String stolen;
    @SerializedName("Search_Points")
    private String sp;

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

    public String getDropped() {
        return dropped;
    }

    public void setDropped(String dropped) {
        this.dropped = dropped;
    }

    public String getStolen() {
        return stolen;
    }

    public void setStolen(String stolen) {
        this.stolen = stolen;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }
}
