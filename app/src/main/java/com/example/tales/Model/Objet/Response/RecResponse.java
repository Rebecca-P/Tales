package com.example.tales.Model.Objet.Response;
import com.example.tales.Model.Objet.Recette;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RecResponse {
   // private Integer count;
    @SerializedName("recette")
    public ArrayList<Recette> recette_element;

    public ArrayList<Recette> getRecette_element() {
        return recette_element;
    }

    public void setRecette_element(ArrayList<Recette> recette_element) {
        this.recette_element = recette_element;
    }
}
