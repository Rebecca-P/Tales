package com.example.tales;
import android.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tales.Objet.Item_Menu;

import java.util.ArrayList;



public abstract class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private ArrayList<Item_Menu> cat;

    public void ajout_menu()
    {
        cat.add(new Item_Menu("Consommables","@drawable/sonso"));
        cat.add(new Item_Menu("Artes","@drawable/main01"));
        cat.add(new Item_Menu("Equipement","@drawable/main02"));
        cat.add(new Item_Menu("Capacité","@drawable/main04"));
        cat.add(new Item_Menu("Recette","@drawable/main06"));
        cat.add(new Item_Menu("Monde","@drawable/sub10"));
        cat.add(new Item_Menu("Personnage","@drawable/main07"));
    }


    /*public int getItem_MenuCount() {
        return cat.size();
    }*/

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.itemlayout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Item_Menu actual = cat.get(position);
        holder.txtHeader.setText;
        String nom = actual.getCategorie();
        holder.
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView name;
        private final TextView description;

        private Pair<String, String> currentPair;

        public MyViewHolder(final View itemView) {
            super(itemView);

            name = ((TextView) itemView.findViewById(R.id.name));
            description = ((TextView) itemView.findViewById(R.id.description));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new AlertDialog.Builder(itemView.getContext())
                            .setTitle(currentPair.first)
                            .setMessage(currentPair.second)
                            .show();
                }
            });
        }


    }

}
