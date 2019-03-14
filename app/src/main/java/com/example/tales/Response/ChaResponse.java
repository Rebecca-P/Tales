package com.example.tales.Response;
import com.example.tales.Objet.Character;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ChaResponse {
   // private Integer count;
    @SerializedName("character")
    public ArrayList<Character> character_element;

    public ArrayList<Character> getCharacter_element() {
        return character_element;
    }

    public void setCharacter_element(ArrayList<Character> character_element) {
        this.character_element = character_element;
    }
}
