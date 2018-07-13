package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricSitesFragment extends Fragment {

    public HistoricSitesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_basic, container, false);

            ImageView imageHeader = rootView.findViewById(R.id.list_header_image);
            imageHeader.setImageResource(R.drawable.museum);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.history_dup_museum), getString(R.string.history_dup_museum_phone), getString(R.string.history_dup_museum_address), getString(R.string.history_dup_museum_details1), getString(R.string.history_dup_museum_details2)));
        locations.add(new Location(getString(R.string.history_apollo), getString(R.string.history_apollo_details1), getString(R.string.history_apollo_address), getString(R.string.history_apollo_dates), getString(R.string.history_apollo_details2)));
        locations.add(new Location(getString(R.string.history_school), getString(R.string.history_school_details1), getString(R.string.history_school_address), getString(R.string.history_school_dates), getString(R.string.history_school_details2)));
        locations.add(new Location(getString(R.string.history_church), getString(R.string.history_church_phone), getString(R.string.history_church_address), getString(R.string.history_church_dates), getString(R.string.history_church_details)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
