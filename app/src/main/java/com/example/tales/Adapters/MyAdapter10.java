package com.example.tales.Adapters;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tales.Objet.Character;
import com.example.tales.Objet.Loca;
import com.example.tales.Objet.Synopsis;
import com.example.tales.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class MyAdapter10 extends RecyclerView.Adapter<MyAdapter10.ViewHolder>{
    public ArrayList<Synopsis> synolist;

    public MyAdapter10(ArrayList<Synopsis> synolist) {
        this.synolist = synolist;
    }

    public int getItemCount() {
        return synolist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //image
        public ImageView image;

        //Texte
        public TextView titre;
        public TextView description;


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


        }
    }
    @Override
    public MyAdapter10.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.synop, parent, false);//a changer ici aussi
        ViewHolder enfin = new ViewHolder(view);
        return enfin ;
    }

    //@Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Synopsis actual = synolist.get(position);




        //image
        Picasso.get().load(actual.getImage())

                .into(holder.image);


        //texte
        holder.titre.setText(actual.getTitre());
        holder.description.setText(actual.getSynop());





    }



}
