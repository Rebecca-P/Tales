package com.example.tales.Model.Objet.Response;
import com.example.tales.Model.Objet.Synopsis;
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


