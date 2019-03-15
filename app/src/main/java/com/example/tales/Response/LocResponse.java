package com.example.tales.Response;
import com.example.tales.Objet.Loca;
import com.example.tales.Objet.Synthese;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class LocResponse {
   // private Integer count;
    @SerializedName("location")
    public ArrayList<Loca> location_element;

    public ArrayList<Loca> getLocation_element() {
        return location_element;
    }

    public void setLocation_element(ArrayList<Loca> location_element) {
        this.location_element = location_element;
    }
}
