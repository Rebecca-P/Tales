package com.example.tales.Objet;
import com.google.gson.annotations.SerializedName;

public class Recette {


    @SerializedName("Icon")
    private String icon;
    @SerializedName("Name")
    private String name;
    @SerializedName("Description")
    private String description;
    @SerializedName("Ingredient")
    private String ingredient;
    @SerializedName("Effet")
    private String effet;
    @SerializedName("Evolution")
    private String evolution;

    @SerializedName("Like")
    private String like;
    @SerializedName("Dislikes")
    private String dislike;
    @SerializedName("Good at")
    private String good;
    @SerializedName("Bad at")
    private String bad;


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


    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getEffet() {
        return effet;
    }

    public void setEffet(String effet) {
        this.effet = effet;
    }

    public String getEvolution() {
        return evolution;
    }

    public void setEvolution(String evolution) {
        this.evolution = evolution;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getDislike() {
        return dislike;
    }

    public void setDislike(String dislike) {
        this.dislike = dislike;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public String getBad() {
        return bad;
    }

    public void setBad(String bad) {
        this.bad = bad;
    }
}
