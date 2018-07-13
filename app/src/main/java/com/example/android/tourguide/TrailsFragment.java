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
public class TrailsFragment extends Fragment {

    public TrailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_basic, container, false);

        ImageView imageHeader = rootView.findViewById(R.id.list_header_image);
        imageHeader.setImageResource(R.drawable.bike);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.trail_murdock_canal), getString(R.string.trail_run_bike_horse), getString(R.string.trail_paved), getString(R.string.trail_murdock_canal_details), getString(R.string.trail_murdock_canal_address)));
        locations.add(new Location(getString(R.string.trail_silver_lake), getString(R.string.trail_hike), getString(R.string.trail_dirt), getString(R.string.trail_silver_lake_details), getString(R.string.trail_silver_lake_address)));
        locations.add(new Location(getString(R.string.trail_battle_creek), getString(R.string.trail_hike_horse), getString(R.string.trail_dirt), getString(R.string.trail_battle_creek_details), getString(R.string.trail_battle_creek_address)));
        locations.add(new Location(getString(R.string.trail_highland_glen), getString(R.string.trail_run_bike), getString(R.string.trail_paved), getString(R.string.trail_highland_glen_details), getString(R.string.trail_highland_glen_address)));
        locations.add(new Location(getString(R.string.trail_mt_timp), getString(R.string.trail_walk_stroller), getString(R.string.trail_paved), getString(R.string.trail_mt_timp_details), getString(R.string.trail_mt_timp_address)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
