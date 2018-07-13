package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_food, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.food_tenneys), getString(R.string.food_delivery), getString(R.string.food_tenneys_phone), getString(R.string.food_tenneys_address), getString(R.string.food_tenneys_details), R.drawable.pizza));
        locations.add(new Location(getString(R.string.food_fongs), getString(R.string.food_delivery), getString(R.string.food_fongs_phone), getString(R.string.food_fongs_address), getString(R.string.food_fongs_details), R.drawable.fong));
        locations.add(new Location(getString(R.string.food_mexiquense), getString(R.string.food_delivery), getString(R.string.food_mexiquense_phone), getString(R.string.food_mexiquense_address), getString(R.string.food_mexiquense_details), R.drawable.mexiquense));
        locations.add(new Location(getString(R.string.food_smart_cookie), getString(R.string.food_pick_up), getString(R.string.food_smart_cookie_phone), getString(R.string.food_smart_cookie_address), getString(R.string.food_smart_cookie_details), R.drawable.cookie));
        locations.add(new Location(getString(R.string.food_band_diner), getString(R.string.food_delivery), getString(R.string.food_band_diner_phone), getString(R.string.food_band_diner_address), getString(R.string.food_band_diner_details), R.drawable.band_diner));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
