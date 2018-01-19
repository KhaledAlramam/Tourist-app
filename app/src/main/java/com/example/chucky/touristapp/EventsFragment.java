package com.example.chucky.touristapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.list_view,container,false);
        final ArrayList<Place> places=new ArrayList<>();

        places.add(new Place(getString(R.string.date669),0,getString(R.string.desc669)));
        places.add(new Place(getString(R.string.date525),0,getString(R.string.desc525)));
        places.add(new Place(getString(R.string.date332),0,getString(R.string.desc332)));
        places.add(new Place(getString(R.string.date31),0,getString(R.string.desc31)));
        places.add(new Place(getString(R.string.date33),0,getString(R.string.desc33)));
        places.add(new Place(getString(R.string.date642),0,getString(R.string.desc642)));
        PlacesViewAdapter adapter=new PlacesViewAdapter(getActivity(),places );

        ListView listView=(ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
