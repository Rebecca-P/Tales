package com.example.tales.Response;
import com.example.tales.Objet.Arte_Menu;
import com.example.tales.Objet.Equipement_item;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class EquiResponse {
   // private Integer count;
    @SerializedName("sword")
    public ArrayList<Equipement_item> sword;
    @SerializedName("axe")
    public ArrayList<Equipement_item> axe;
    @SerializedName("spear")
    public ArrayList<Equipement_item> spear;
    @SerializedName("maul")
    public ArrayList<Equipement_item> maul;
    @SerializedName("staff")
    public ArrayList<Equipement_item> staff;
    @SerializedName("mace")
    public ArrayList<Equipement_item> mace;
    @SerializedName("echarpe")
    public ArrayList<Equipement_item> echarpe;
    @SerializedName("chaine")
    public ArrayList<Equipement_item> chaine;
    @SerializedName("light")
    public ArrayList<Equipement_item> light;
    @SerializedName("eavy")
    public ArrayList<Equipement_item> eavy;
    @SerializedName("dagger")
    public ArrayList<Equipement_item> dagger;
    @SerializedName("knife")
    public ArrayList<Equipement_item> knife;

    public ArrayList<Equipement_item> getSword() {
        return sword;
    }

    public void setSword(ArrayList<Equipement_item> sword) {
        this.sword = sword;
    }

    public ArrayList<Equipement_item> getAxe() {
        return axe;
    }

    public void setAxe(ArrayList<Equipement_item> axe) {
        this.axe = axe;
    }

    public ArrayList<Equipement_item> getSpear() {
        return spear;
    }

    public void setSpear(ArrayList<Equipement_item> spear) {
        this.spear = spear;
    }

    public ArrayList<Equipement_item> getMaul() {
        return maul;
    }

    public void setMaul(ArrayList<Equipement_item> maul) {
        this.maul = maul;
    }

    public ArrayList<Equipement_item> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<Equipement_item> staff) {
        this.staff = staff;
    }

    public ArrayList<Equipement_item> getMace() {
        return mace;
    }

    public void setMace(ArrayList<Equipement_item> mace) {
        this.mace = mace;
    }

    public ArrayList<Equipement_item> getEcharpe() {
        return echarpe;
    }

    public void setEcharpe(ArrayList<Equipement_item> echarpe) {
        this.echarpe = echarpe;
    }

    public ArrayList<Equipement_item> getChaine() {
        return chaine;
    }

    public void setChaine(ArrayList<Equipement_item> chaine) {
        this.chaine = chaine;
    }

    public ArrayList<Equipement_item> getLight() {
        return light;
    }

    public void setLight(ArrayList<Equipement_item> light) {
        this.light = light;
    }

    public ArrayList<Equipement_item> getEavy() {
        return eavy;
    }

    public void setEavy(ArrayList<Equipement_item> eavy) {
        this.eavy = eavy;
    }

    public ArrayList<Equipement_item> getDagger() {
        return dagger;
    }

    public void setDagger(ArrayList<Equipement_item> dagger) {
        this.dagger = dagger;
    }

    public ArrayList<Equipement_item> getKnife() {
        return knife;
    }

    public void setKnife(ArrayList<Equipement_item> knife) {
        this.knife = knife;
    }
}
