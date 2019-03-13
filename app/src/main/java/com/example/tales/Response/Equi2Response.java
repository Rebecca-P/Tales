package com.example.tales.Response;
import com.example.tales.Objet.Equipement_item;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Equi2Response {
   // private Integer count;
    @SerializedName("second")
    public ArrayList<Equipement_item> second;
    @SerializedName("head")
    public ArrayList<Equipement_item> head;
    @SerializedName("body")
    public ArrayList<Equipement_item> body;
    @SerializedName("accessories")
    public ArrayList<Equipement_item> acce;

    public ArrayList<Equipement_item> getSecond() {
        return second;
    }

    public void setSecond(ArrayList<Equipement_item> second) {
        this.second = second;
    }

    public ArrayList<Equipement_item> getHead() {
        return head;
    }

    public void setHead(ArrayList<Equipement_item> head) {
        this.head = head;
    }

    public ArrayList<Equipement_item> getBody() {
        return body;
    }

    public void setBody(ArrayList<Equipement_item> body) {
        this.body = body;
    }

    public ArrayList<Equipement_item> getAcce() {
        return acce;
    }

    public void setAcce(ArrayList<Equipement_item> acce) {
        this.acce = acce;
    }
}
