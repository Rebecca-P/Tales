package com.example.tales.Model.Objet;
import com.google.gson.annotations.SerializedName;

public class Arte_Menu {

    @SerializedName("Icon")
    private String url_img;
    @SerializedName("Type")
    private String type;
    @SerializedName("Name")
    private String name_item;
    @SerializedName("Description")
    private String description_item;
    @SerializedName("Detail")
    private String detail;
    @SerializedName("TP_Level")
    private String tp_level;
    @SerializedName("Alter")
    private String alter;
    @SerializedName("Capacite")
    private String capacite;

    public String getUrl_img() {
        return url_img;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTp_level() {
        return tp_level;
    }

    public void setTp_level(String tp_level) {
        this.tp_level = tp_level;
    }

    public String getAlter() {
        return alter;
    }

    public void setAlter(String alter) {
        this.alter = alter;
    }

    public String getCapacite() {
        return capacite;
    }

    public void setCapacite(String capacite) {
        this.capacite = capacite;
    }
}
