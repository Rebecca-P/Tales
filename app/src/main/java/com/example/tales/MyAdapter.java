package com.example.tales;
import android.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tales.Objet.Item_Menu;

import java.util.ArrayList;
import java.util.Arrays;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private ArrayList<Item_Menu> cat =new ArrayList<Item_Menu>(
            Arrays.asList(
                    new Item_Menu("Consommables",R.drawable.conso),
                    new Item_Menu("Artes",R.drawable.main01),
                    new Item_Menu("Equipement",R.drawable.main02),
                    new Item_Menu("Capacité",R.drawable.main04),
                    new Item_Menu("Recette",R.drawable.main06),
                    new Item_Menu("Monde",R.drawable.sub10),
                    new Item_Menu("Personnage",R.drawable.main07)
            )
    );

    /*public void ajout_menu()
    {
        cat.add(new Item_Menu("Consommables",R.drawable.conso));
        cat.add(new Item_Menu("Artes",R.drawable.main01));
        cat.add(new Item_Menu("Equipement",R.drawable.main02));
        cat.add(new Item_Menu("Capacité",R.drawable.main04));
        cat.add(new Item_Menu("Recette",R.drawable.main06));
        cat.add(new Item_Menu("Monde",R.drawable.sub10));
        cat.add(new Item_Menu("Personnage",R.drawable.main07));
    }*/


    public int getItemCount() {
        return cat.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView iconoimage;
        public TextView titrenotitle;
        public View layout;

        //private String src_image;

        public ViewHolder(View avoir)
        {
            super(avoir);
            layout = avoir;
            iconoimage = (ImageView) avoir.findViewById(R.id.icon1);
            titrenotitle = (TextView) avoir.findViewById(R.id.name_2);
        }
    }
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.itemlayout, parent, false);
        ViewHolder enfin = new ViewHolder(view);
        return enfin ;
    }

    //@Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item_Menu actual = cat.get(position);
        String nom = actual.getCategorie();
        Integer source = actual.getImag();
        holder.titrenotitle.setText(nom);
        holder.iconoimage.setImageResource(source);
    }




}
