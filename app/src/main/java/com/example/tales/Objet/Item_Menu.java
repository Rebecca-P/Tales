package com.example.tales.Objet;
import android.widget.Button;

public class Item_Menu {

    private String categorie;
    private String imag;
    //private Button myButton ;

    public Item_Menu(String categorie, String imag) {
        this.categorie = categorie;
        this.imag = imag;
    }

    /*public Button getMyButton() {
        return myButton;
    }

    public void setMyButton(Button myButton) {
        this.myButton = myButton;
    }*/

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getImag() {
        return imag;
    }

    public void setImag(String imag) {
        this.imag = imag;
    }
}
