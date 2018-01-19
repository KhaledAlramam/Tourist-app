package com.example.chucky.touristapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Beaches extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.list_view,container,false);


        final ArrayList<Place> places=new ArrayList<>();

        places.add(new Place(getString(R.string.marsaN),R.drawable.marsan,getString(R.string.marsaNDesc)));
        places.add(new Place(getString(R.string.mah),R.drawable.mah,getString(R.string.mahDesc)));
        places.add(new Place(getString(R.string.rasB),R.drawable.rasb,getString(R.string.rasBDesc)));
        places.add(new Place(getString(R.string.wadi),R.drawable.wadi,getString(R.string.wadiDesc)));
        places.add(new Place(getString(R.string.sunken),R.drawable.sunken,getString(R.string.sunkenDesc)));

        PlacesViewAdapter adapter=new PlacesViewAdapter(getActivity(),places );

        ListView listView=(ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
