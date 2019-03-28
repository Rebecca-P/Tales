package com.example.tales.Controller.Adapters;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tales.Model.Objet.Character;
import com.example.tales.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class MyAdapter7 extends RecyclerView.Adapter<MyAdapter7.ViewHolder>{
    public ArrayList<Character> characterlist;

    public MyAdapter7(ArrayList<Character> characterlist) {
        this.characterlist = characterlist;
    }

    public int getItemCount() {
        return characterlist.size();
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
    public MyAdapter7.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.artesimple, parent, false);//a changer ici aussi
        ViewHolder enfin = new ViewHolder(view);
        return enfin ;
    }

    //@Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Character actual = characterlist.get(position);


        String titre = actual.getName();

        //image
        Picasso.get().load(actual.getIcon())
                .resize(100,100)
                .into(holder.iconnoperso);


        //texte
        holder.namenoperso.setText(titre);




    }




}
