package com.example.user.tourguideapp;

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

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView nameTextView = (TextView) convertView.findViewById(R.id.text_name);
        nameTextView.setText(currentPlace.getName());
        TextView addressTextView = (TextView) convertView.findViewById(R.id.text_address);
        addressTextView.setText(currentPlace.getAddress());
        TextView phoneTextView = (TextView) convertView.findViewById(R.id.text_phone);
        phoneTextView.setText(currentPlace.getPhone());
        TextView websiteTextView = (TextView) convertView.findViewById(R.id.text_website);
        websiteTextView.setText(currentPlace.getWebsite());
        ImageView placeImageView = (ImageView) convertView.findViewById(R.id.image_place);
        placeImageView.setImageResource(currentPlace.getImageResourceId());

        return convertView;
    }
}
