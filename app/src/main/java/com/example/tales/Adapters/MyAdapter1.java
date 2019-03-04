package com.example.tales.Adapters;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tales.Objet.Item_Menu;
import com.example.tales.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Arrays;


public class MyAdapter1 extends RecyclerView.Adapter<MyAdapter1.ViewHolder>{
    private ArrayList<Item_Menu> objet_conso;

    public MyAdapter1(ArrayList<Item_Menu> objet_conso) {
        this.objet_conso = objet_conso;
    }

    public int getItemCount() {
        return objet_conso.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView iconoimage;
        public TextView titrenotitle;
        public TextView descriptionnodes;
        public View layout;



        public ViewHolder(View avoir)
        {
            super(avoir);
            layout = avoir;
            iconoimage = (ImageView) avoir.findViewById(R.id.icon1);
            titrenotitle = (TextView) avoir.findViewById(R.id.name_2);
            descriptionnodes = (TextView) avoir.findViewById(R.id.descrip);
        }
    }
    @Override
    public MyAdapter1.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.itemlayout, parent, false);
        ViewHolder enfin = new ViewHolder(view);
        return enfin ;
    }

    //@Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item_Menu actual = objet_conso.get(position);

        String url = actual.getUrl_img();
        String nom = actual.getName_item();
        String des = actual.getDescription_item();

        holder.titrenotitle.setText(nom);
        holder.descriptionnodes.setText(des);
        Picasso.get().load(url).into(holder.iconoimage);

    }




}
