package com.example.tales.Response;
import com.example.tales.Objet.Item_Menu;

import java.util.ArrayList;

public class ItemResponse {
    private Integer count;
    private ArrayList<Item_Menu> item_element;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ArrayList<Item_Menu> getItem_element() {
        return item_element;
    }

    public void setItem_element(ArrayList<Item_Menu> item_element) {
        this.item_element = item_element;
    }
}
