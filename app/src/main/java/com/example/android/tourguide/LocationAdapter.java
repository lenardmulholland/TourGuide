package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location>{

    public LocationAdapter(Activity context, ArrayList<Location> locations){
        super(context, 0, locations);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView locationTitleTextView = listItemView.findViewById(R.id.location_title_text_view);
        locationTitleTextView.setText(currentLocation.getLocationTitle());

        TextView infoLine1TextView = listItemView.findViewById(R.id.info_line1_text_view);
        infoLine1TextView.setText(currentLocation.getInfoLine1());

        TextView infoLine2TextView = listItemView.findViewById(R.id.info_line2_text_view);
        infoLine2TextView.setText(currentLocation.getInfoLine2());

        TextView infoLine3TextView = listItemView.findViewById(R.id.info_line3_text_view);
        infoLine3TextView.setText(currentLocation.getInfoLine3());

        TextView infoLine4TextView = listItemView.findViewById(R.id.info_line4_text_view);
        infoLine4TextView.setText(currentLocation.getInfoLine4());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentLocation.hasImage()) {
            imageView.setImageResource(currentLocation.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
