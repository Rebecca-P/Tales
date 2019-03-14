package com.example.tales.Response;
import com.example.tales.Objet.Recette;
import com.example.tales.Objet.Synthese;
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
