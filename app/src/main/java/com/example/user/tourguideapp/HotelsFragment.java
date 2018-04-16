package com.example.user.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.support.v4.app.Fragment;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.hotel1_name, R.string.hotel1_address, R.string.hotel1_phone, R.string.hotel1_website, R.drawable.hotel1));
        places.add(new Place(R.string.hotel2_name, R.string.hotel2_address, R.string.hotel2_phone, R.string.hotel2_website, R.drawable.hotel2));
        places.add(new Place(R.string.hotel3_name, R.string.hotel3_address, R.string.hotel3_phone, R.string.hotel3_website, R.drawable.hotel3));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
