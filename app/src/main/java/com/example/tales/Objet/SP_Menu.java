package com.example.tales.Objet;
import com.google.gson.annotations.SerializedName;

public class SP_Menu {


    @SerializedName("Name")
    private String name_item;
    @SerializedName("Synthese_material")
    private String material;

    public String getName_item() {
        return name_item;
    }

    public void setName_item(String name_item) {
        this.name_item = name_item;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
