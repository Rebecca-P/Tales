package com.example.tales.Model.Objet.Response;
import com.example.tales.Model.Objet.SP_Menu;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
public class SPResponse {

    @SerializedName("SP")
    public ArrayList<SP_Menu> sp_element;

    public ArrayList<SP_Menu> getSp_element() {
        return sp_element;
    }

    public void setSp_element(ArrayList<SP_Menu> sp_element) {
        this.sp_element = sp_element;
    }
}