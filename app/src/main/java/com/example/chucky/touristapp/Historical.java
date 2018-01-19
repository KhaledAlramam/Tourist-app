package com.example.chucky.touristapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Historical extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.list_view,container,false);
        final ArrayList<Place> places=new ArrayList<>();

        places.add(new Place(getString(R.string.pyramids),R.drawable.pyramids,getString(R.string.pyramidsDesc)));
        places.add(new Place(getString(R.string.saqqara),R.drawable.saqqara,getString(R.string.saqqaraDesc)));
        places.add(new Place(getString(R.string.karnak),R.drawable.karnak,getString(R.string.karnakDesc)));
        places.add(new Place(getString(R.string.luxorTemp),R.drawable.luxor,getString(R.string.luxorTempDesc)));
        places.add(new Place(getString(R.string.hatsh),R.drawable.hatsh,getString(R.string.hatshDesc)));

        PlacesViewAdapter adapter=new PlacesViewAdapter(getActivity(),places );

        ListView listView=(ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
