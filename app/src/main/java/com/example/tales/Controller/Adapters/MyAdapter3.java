package com.example.tales.Controller.Adapters;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tales.Model.Objet.Synthese;
import com.example.tales.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class MyAdapter3 extends RecyclerView.Adapter<MyAdapter3.ViewHolder>{
    public ArrayList<Synthese> synlist;

    public MyAdapter3(ArrayList<Synthese> synlist) {
        this.synlist = synlist;
    }

    public int getItemCount() {
        return synlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //image
        public ImageView iconnoperso;

        //Texte
        public TextView namenoperso;

        //View
        public View layout;



        public ViewHolder(View avoir)
        {
            super(avoir);
            layout = avoir;
            //image
            iconnoperso = (ImageView) avoir.findViewById(R.id.iconoperso);

            //texte
            namenoperso = (TextView) avoir.findViewById(R.id.namenoperso);

        }
    }
    @Override
    public MyAdapter3.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.artesimple, parent, false);//a changer ici aussi
        ViewHolder enfin = new ViewHolder(view);
        return enfin ;
    }

    //@Override
    public void onBindViewHolder(ViewHolder holder, int position) {//ppoo

        Synthese actual = synlist.get(position);


        String titre = actual.getName();

        //image
        Picasso.get().load(actual.getIcon())
                .resize(100,100)
                .into(holder.iconnoperso);


        //texte
        holder.namenoperso.setText(titre);




    }




}
