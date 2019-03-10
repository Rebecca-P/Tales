package com.example.tales.Response;
import com.example.tales.Objet.Arte_Menu;
import com.example.tales.Objet.Synthese;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SynResponse {
   // private Integer count;
    @SerializedName("Synthese")
    public ArrayList<Synthese> synthese_element;

    public ArrayList<Synthese> getSynthese_element() {
        return synthese_element;
    }

    public void setSynthese_element(ArrayList<Synthese> synthese_element) {
        this.synthese_element = synthese_element;
    }
}
