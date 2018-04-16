package com.example.user.tourguideapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FunsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.fun1_name, R.string.fun1_address, R.string.fun1_phone, R.string.fun1_website, R.drawable.fun1));
        places.add(new Place(R.string.fun2_name, R.string.fun2_address, R.string.fun2_phone, R.string.fun2_website, R.drawable.fun2));
        places.add(new Place(R.string.fun3_name, R.string.fun3_address, R.string.fun3_phone, R.string.fun3_website, R.drawable.fun3));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
