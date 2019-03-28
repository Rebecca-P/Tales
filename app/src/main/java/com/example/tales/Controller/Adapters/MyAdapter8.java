package com.example.tales.Controller.Adapters;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tales.Model.Objet.SP_Menu;
import com.example.tales.R;

import java.util.ArrayList;


public class MyAdapter8 extends RecyclerView.Adapter<MyAdapter8.ViewHolder>{
    public ArrayList<SP_Menu> splist;

    public MyAdapter8(ArrayList<SP_Menu> splist) {
        this.splist = splist;
    }

    public int getItemCount() {
        return splist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        //Texte
        public TextView name;
        public TextView sp;

        //View
        public View layout;



        public ViewHolder(View avoir)
        {
            super(avoir);
            layout = avoir;
            //texte
            name = (TextView) avoir.findViewById(R.id.Title);
            sp = (TextView) avoir.findViewById(R.id.sp_item);

        }
    }
    @Override
    public MyAdapter8.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.sp_layout, parent, false);//a changer ici aussi
        ViewHolder enfin = new ViewHolder(view);
        return enfin ;
    }

    //@Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        SP_Menu actual = splist.get(position);


        String titre = actual.getName_item();
        String quoi = actual.getMaterial();


        //texte
        holder.name.setText(titre);
        holder.sp.setText(quoi);




    }




}
