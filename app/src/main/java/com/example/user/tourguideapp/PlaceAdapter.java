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

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    static class ViewHolder {
        @BindView(R.id.text_name)
        TextView nameTextView;
        @BindView(R.id.text_address)
        TextView addressTextView;
        @BindView(R.id.text_phone)
        TextView phoneTextView;
        @BindView(R.id.text_website)
        TextView websiteTextView;
        @BindView(R.id.image_place)
        ImageView placeImageView;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Place currentPlace = getItem(position);

        holder.nameTextView.setText(currentPlace.getName());
        holder.addressTextView.setText(currentPlace.getAddress());
        holder.phoneTextView.setText(currentPlace.getPhone());
        holder.websiteTextView.setText(currentPlace.getWebsite());
        holder.placeImageView.setImageResource(currentPlace.getImageResourceId());

        return convertView;
    }
}
