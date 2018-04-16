package com.example.user.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.food1_name, R.string.food1_address, R.string.food1_phone, R.string.food1_website, R.drawable.food1));
        places.add(new Place(R.string.food2_name, R.string.food2_address, R.string.food2_phone, R.string.food2_website, R.drawable.food2));
        places.add(new Place(R.string.food3_name, R.string.food3_address, R.string.food3_phone, R.string.food3_website, R.drawable.food3));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
