package com.example.tales.Objet;
import com.google.gson.annotations.SerializedName;

public class Item_Menu {

    @SerializedName("Icon")
    private String url_img;
    @SerializedName("Name EN")
    private String name_item;
    @SerializedName("Description")
    private String description_item;

    public String getUrl_img() {
        return url_img;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }

    public String getName_item() {
        return name_item;
    }

    public void setName_item(String name_item) {
        this.name_item = name_item;
    }

    public String getDescription_item() {
        return description_item;
    }

    public void setDescription_item(String description_item) {
        this.description_item = description_item;
    }
}
