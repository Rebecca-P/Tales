package com.example.tales.Response;
import com.example.tales.Objet.Arte_Menu;
import com.example.tales.Objet.Item_Menu;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ArteResponse {
   // private Integer count;
    @SerializedName("artes")
    public ArrayList<Arte_Menu> arte_element;

    public ArrayList<Arte_Menu> getArte_element() {
        return arte_element;
    }

    public void setArte_element(ArrayList<Arte_Menu> arte_element) {
        this.arte_element = arte_element;
    }
}
