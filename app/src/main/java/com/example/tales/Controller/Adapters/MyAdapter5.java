package com.example.tales.Controller.Adapters;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tales.Model.Objet.Skill_item;
import com.example.tales.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

//TODO a faire en skill
public class MyAdapter5 extends RecyclerView.Adapter<MyAdapter5.ViewHolder>{
    public ArrayList<Skill_item> skilllist;

    public MyAdapter5(ArrayList<Skill_item> skilllist) {
        this.skilllist = skilllist;
    }

    public int getItemCount() {
        return skilllist.size();
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
    public MyAdapter5.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.artesimple, parent, false);//a changer ici aussi
        ViewHolder enfin = new ViewHolder(view);
        return enfin ;
    }

    //@Override
    public void onBindViewHolder(ViewHolder holder, int position) {//ppoo

        Skill_item actual = skilllist.get(position);


        String titre = actual.getName();

        //image
        Picasso.get().load(actual.getIcon())
                .resize(100,100)
                .into(holder.iconnoperso);


        //texte
        holder.namenoperso.setText(titre);




    }




}
