package com.example.tales.Response;
import com.example.tales.Objet.Skill_item;
import com.example.tales.Objet.Synthese;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SkillResponse {
   // private Integer count;
    @SerializedName("skill")
    public ArrayList<Skill_item> skill_element;

    public ArrayList<Skill_item> getSkill_element() {
        return skill_element;
    }

    public void setSkill_element(ArrayList<Skill_item> skill_element) {
        this.skill_element = skill_element;
    }
}
