package com.example.tales.Response;
import com.example.tales.Objet.Item_Menu;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ItemResponse {
   // private Integer count;
    @SerializedName("item")
    private ArrayList<Item_Menu> item_element;


    public ArrayList<Item_Menu> getItem_element() {
        return item_element;
    }

    public void setItem_element(ArrayList<Item_Menu> item_element) {
        this.item_element = item_element;
    }
}
