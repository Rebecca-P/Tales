package com.example.tales.Adapters;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tales.Objet.Arte_Menu;
import com.example.tales.Objet.Item_Menu;
import com.example.tales.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.ViewHolder>{
    private ArrayList<Arte_Menu> arte_element;

    public MyAdapter2(ArrayList<Arte_Menu> arte_element) {
        this.arte_element = arte_element;
    }

    public int getItemCount() {
        return arte_element.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //image
        public ImageView iconperso;
        public ImageView icontype;
        public ImageView icontype1;
        public ImageView icontype2;
        public ImageView icontype3;
        //Texte
        public TextView titrenotitle;
        public TextView description1;
        public TextView description2;
        public TextView descriptionalter;
        public TextView descriptionskill;
        //View
        public View layout;



        public ViewHolder(View avoir)
        {
            super(avoir);
            layout = avoir;
            //image
            iconperso = (ImageView) avoir.findViewById(R.id.icon_perso_arte);
            icontype = (ImageView) avoir.findViewById(R.id.icon_type);
            icontype1 = (ImageView) avoir.findViewById(R.id.icon_type1);
            icontype2 = (ImageView) avoir.findViewById(R.id.icon_type2);
            icontype3 = (ImageView) avoir.findViewById(R.id.icon_type3);

            //texte
            titrenotitle = (TextView) avoir.findViewById(R.id.titre_art);
            description1 = (TextView) avoir.findViewById(R.id.descrip1);
            description2 = (TextView) avoir.findViewById(R.id.descrip2);
            descriptionalter = (TextView) avoir.findViewById(R.id.responsealter);
            descriptionskill = (TextView) avoir.findViewById(R.id.responseskill);
        }
    }
    @Override
    public MyAdapter2.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.itemlayout, parent, false);
        ViewHolder enfin = new ViewHolder(view);
        return enfin ;
    }

    //@Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Arte_Menu actual = arte_element.get(position);
        ArrayList<String> url_mini= new ArrayList<String>();
        String[] url_mini= actual.getDetail().split(" ");


        //image
        Picasso.get().load(actual.getUrl_img()).into(holder.iconoimage);
        Picasso.get().load(actual.getType()).into(holder.iconoimage);
        Picasso.get().load(url_mini[0]).into(holder.iconoimage);
        if (mots.length>1)
        Picasso.get().load(url_mini[1]).into(holder.iconoimage);
        if (mots.length>2)
        Picasso.get().load(url_mini[2]).into(holder.iconoimage);

        //texte
        holder.titrenotitle.setText(actual.getName_item());
        holder.descriptionnodes.setText(actual.getDescription_item());
        holder.titrenotitle.setText(actual.getDetail());
        holder.titrenotitle.setText(actual.getAlter());
        holder.titrenotitle.setText(actual.getCapacite());


    }




}
