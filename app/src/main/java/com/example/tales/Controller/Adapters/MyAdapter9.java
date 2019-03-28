package com.example.tales.Controller.Adapters;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tales.Model.Objet.Loca;
import com.example.tales.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class MyAdapter9 extends RecyclerView.Adapter<MyAdapter9.ViewHolder>{
    public ArrayList<Loca> localisationlist;

    public MyAdapter9(ArrayList<Loca> localisationlist) {
        this.localisationlist = localisationlist;
    }

    public int getItemCount() {
        return localisationlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //image
        public ImageView image;

        //Texte
        public TextView titre;
        public TextView description;
        public TextView supplementaire;

        //View
        public View layout;



        public ViewHolder(View avoir)
        {
            super(avoir);
            layout = avoir;
            //image
            image = (ImageView) avoir.findViewById(R.id.location);

            //texte
            titre = (TextView) avoir.findViewById(R.id.titre);
            description = (TextView) avoir.findViewById(R.id.descr);
            supplementaire = (TextView) avoir.findViewById(R.id.supp);

        }
    }
    @Override
    public MyAdapter9.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.location, parent, false);//a changer ici aussi
        ViewHolder enfin = new ViewHolder(view);
        return enfin ;
    }

    //@Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Loca actual = localisationlist.get(position);




        //image
        if (!actual.getImage().isEmpty())
            Picasso.get().load(actual.getImage()).into(holder.image);
        else  Picasso.get().load("http://www.thelockinmovie.com/wp-content/uploads/2018/09/red-x-clipart-red-x-clipart-x-marks-the-spot-2-clip-art-at-clker-vector-clip-art-clipart-download-wallpaper.png").into(holder.image);

        //texte
        holder.titre.setText(actual.getLieu());
        holder.description.setText(actual.getDes());
        holder.supplementaire.setText(actual.getSupp());




    }




}
