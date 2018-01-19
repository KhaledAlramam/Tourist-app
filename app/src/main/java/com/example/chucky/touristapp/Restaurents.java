package com.example.chucky.touristapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurents extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.list_view,container,false);

        final ArrayList<Place> places=new ArrayList<>();

        places.add(new Place(getString(R.string.seq),R.drawable.seq,getString(R.string.seqDesc)));
        places.add(new Place(getString(R.string.andrea),R.drawable.andrea,getString(R.string.andreaDesc)));
        places.add(new Place(getString(R.string.pico),R.drawable.pico,getString(R.string.picoDesc)));

        PlacesViewAdapter adapter=new PlacesViewAdapter(getActivity(),places );
        ListView listView=(ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
