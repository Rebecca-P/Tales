package com.example.tales.Objet;
import android.widget.Button;

public class Item_Menu {

    private String categorie;
    private Integer imag;

    public Item_Menu(String categorie, Integer imag) {
        this.categorie = categorie;
        this.imag = imag;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Integer getImag() {
        return imag;
    }

    public void setImag(Integer imag) {
        this.imag = imag;
    }
}
