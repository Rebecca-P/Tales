package com.example.tales.Response;
import com.example.tales.Objet.Synopsis;
import com.example.tales.Objet.Synthese;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SynoResponse {
    // private Integer count;
    @SerializedName("synopsis")
    public ArrayList<Synopsis> synopsis_element;

    public ArrayList<Synopsis> getSynopsis_element() {
        return synopsis_element;
    }

    public void setSynopsis_element(ArrayList<Synopsis> synopsis_element) {
        this.synopsis_element = synopsis_element;
    }
}


