package com.example.user.tourguideapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.sight1_name, R.string.sight1_address, R.string.sight1_phone, R.string.sight1_website, R.drawable.sight1));
        places.add(new Place(R.string.sight2_name, R.string.sight2_address, R.string.sight2_phone, R.string.sight2_website, R.drawable.sight2));
        places.add(new Place(R.string.sight3_name, R.string.sight3_address, R.string.sight3_phone, R.string.sight3_website, R.drawable.sight3));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
