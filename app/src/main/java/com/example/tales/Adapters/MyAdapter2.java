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
import com.example.tales.RecyclerTouchListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.ViewHolder>{
    public ArrayList<Arte_Menu> arte_element;

    public MyAdapter2(ArrayList<Arte_Menu> arte_element) {
        this.arte_element = arte_element;
    }

    public int getItemCount() {
        return arte_element.size();
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
    public MyAdapter2.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.artesimple, parent, false);//a changer ici aussi
        ViewHolder enfin = new ViewHolder(view);
        return enfin ;
    }

    //@Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Arte_Menu actual = arte_element.get(position);

        String[] url_mini= actual.getDetail().split(" ");
        String titre = actual.getName_item();

        //image
        Picasso.get().load(actual.getUrl_img())
                .resize(75,75)
                .into(holder.iconnoperso);


        //texte
        holder.namenoperso.setText(titre);




    }




}
