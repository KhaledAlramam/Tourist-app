package com.example.chucky.touristapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//FINISHED
//Custom array adapeter to handle the list view requests

public class PlacesViewAdapter extends ArrayAdapter<Place> {
    public PlacesViewAdapter(@NonNull Context context, ArrayList<Place> arrayList) {
        super(context, 0,arrayList);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Place currentPlace=getItem(position);
        if (convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(
                    R.layout.list_place,parent,false);
        }
        TextView title=(TextView) convertView.findViewById(R.id.place_title);
        TextView desc=(TextView) convertView.findViewById(R.id.place_desc);
        ImageView img=(ImageView) convertView.findViewById(R.id.place_img);

        title.setText(currentPlace.getmTitle().toString());
        desc.setText(currentPlace.getmDesc().toString());
        if (currentPlace.getmImgId() != 0){
            img.setImageResource(currentPlace.getmImgId());
        }else {
            img.setVisibility(View.GONE);
        }


        return convertView;
    }
}
