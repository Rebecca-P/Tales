package com.example.tales.Controller.Adapters;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tales.Model.Objet.Arte_Menu;
import com.example.tales.Model.Objet.Character;
import com.example.tales.Model.Objet.Equipement_item;
import com.example.tales.Model.Objet.Item_Menu;
import com.example.tales.Model.Objet.Loca;
import com.example.tales.Model.Objet.Recette;
import com.example.tales.Model.Objet.Skill_item;
import com.example.tales.Model.Objet.Synthese;
import com.example.tales.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class RechercheAdapter extends RecyclerView.Adapter<RechercheAdapter.ViewHolder>{
    public ArrayList findlist;

    public RechercheAdapter(ArrayList findlist) {
        this.findlist = findlist;
    }

    public int getItemCount() {
        return findlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //image
        public ImageView image;

        //Texte
        public TextView titre;



        //View
        public View layout;



        public ViewHolder(View avoir)
        {
            super(avoir);
            layout = avoir;
            //image
            image = (ImageView) avoir.findViewById(R.id.iconoperso);

            //texte
            titre = (TextView) avoir.findViewById(R.id.namenoperso);



        }
    }
    @Override
    public RechercheAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.artesimple, parent, false);//a changer ici aussi
        ViewHolder enfin = new ViewHolder(view);
        return enfin ;
    }

    //@Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Object actual = findlist.get(position);

        if (actual instanceof Item_Menu)
        {
            //image
            Picasso.get().load(((Item_Menu) actual).getUrl_img())
                    .resize(200,200)
                    .into(holder.image);


            //texte
            holder.titre.setText(((Item_Menu) actual).getName_item());
        }else if (actual instanceof Arte_Menu)
        {
            //image
            Picasso.get().load(((Arte_Menu) actual).getUrl_img())
                    .resize(200,200)
                    .into(holder.image);


            //texte
            holder.titre.setText(((Arte_Menu) actual).getName_item());

        }else if (actual instanceof Synthese)
        {
            //image
            Picasso.get().load(((Synthese) actual).getIcon())
                    .resize(200,200)
                    .into(holder.image);


            //texte
            holder.titre.setText(((Synthese) actual).getName());

        }else if (actual instanceof Equipement_item)
        {
            //image
            Picasso.get().load(((Equipement_item) actual).getUrl_img())
                    .resize(200,200)
                    .into(holder.image);


            //texte
            holder.titre.setText(((Equipement_item) actual).getName_equ());

        }else if (actual instanceof Skill_item)
        {
            //image
            Picasso.get().load(((Skill_item) actual).getIcon())
                    .resize(200,200)
                    .into(holder.image);


            //texte
            holder.titre.setText(((Skill_item) actual).getName());

        }else if (actual instanceof Recette)
        {
            //image
            Picasso.get().load(((Recette) actual).getIcon())
                    .resize(200,200)
                    .into(holder.image);


            //texte
            holder.titre.setText(((Recette) actual).getName());

        }else if (actual instanceof Character)
        {
            //image
            Picasso.get().load(((Character) actual).getIcon())
                    .resize(200,200)
                    .into(holder.image);


            //texte
            holder.titre.setText(((Character) actual).getName());

        }else if (actual instanceof Loca)
        {
            //image
            /*
            Picasso.get().load(((Loca) actual).getImage())
                    .resize(200,200)
                    .into(holder.image);
            */
            if (!((Loca) actual).getImage().isEmpty())
                Picasso.get().load(((Loca) actual).getImage())
                        .resize(200,200)
                        .into(holder.image);
            else  Picasso.get().load("http://www.thelockinmovie.com/wp-content/uploads/2018/09/red-x-clipart-red-x-clipart-x-marks-the-spot-2-clip-art-at-clker-vector-clip-art-clipart-download-wallpaper.png").into(holder.image);

            //texte
            holder.titre.setText(((Loca) actual).getLieu());

        }










    }



}
