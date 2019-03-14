package com.example.tales.Objet;
import com.google.gson.annotations.SerializedName;

public class Character {


    @SerializedName("Icon")
    private String icon;
    @SerializedName("Image")
    private String image;
    @SerializedName("Name")
    private String name;
    @SerializedName("Hometown")
    private String home;
    @SerializedName("Age")
    private String age;
    @SerializedName("Height")
    private String height;
    @SerializedName("Race")
    private String race;
    @SerializedName("Occupation")
    private String occup;
    @SerializedName("Weapon")
    private String weapon;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getOccup() {
        return occup;
    }

    public void setOccup(String occup) {
        this.occup = occup;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
