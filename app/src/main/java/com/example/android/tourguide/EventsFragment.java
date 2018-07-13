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
public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_basic, container, false);

        ImageView imageHeader = rootView.findViewById(R.id.list_header_image);
        imageHeader.setImageResource(R.drawable.band);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.event_concerts), getString(R.string.event_concerts_times), getString(R.string.quail_cove_amphitheater), getString(R.string.quail_cove_address), getString(R.string.event_concert_details)));
        locations.add(new Location(getString(R.string.event_art_show), getString(R.string.event_art_show_times1), getString(R.string.event_art_show_times2), getString(R.string.af_library_and_address), getString(R.string.event_art_show_details)));
        locations.add(new Location(getString(R.string.event_carnival), getString(R.string.events_carnival_times1), getString(R.string.events_carnival_times2), getString(R.string.robinson_park_and_address), getString(R.string.event_carnival_details)));
        locations.add(new Location(getString(R.string.event_soap_box_derby), getString(R.string.event_soap_box_derby_times), getString(R.string.event_soap_box_derby_place), getString(R.string.event_saop_box_derby_details1), getString(R.string.event_saop_box_derby_details2)));
        locations.add(new Location(getString(R.string.event_movie), getString(R.string.event_movie_title), getString(R.string.event_movie_time), getString(R.string.art_dye_park), getString(R.string.art_dye_park_address)));
        locations.add(new Location(getString(R.string.event_parade), getString(R.string.event_parade_time), getString(R.string.event_parade_place), getString(R.string.event_parade_details1), getString(R.string.event_parade_details2)));
        locations.add(new Location(getString(R.string.event_fair), getString(R.string.event_fair_time), getString(R.string.art_dye_park), getString(R.string.art_dye_park_address), getString(R.string.event_fair_details)));
        locations.add(new Location(getString(R.string.event_fireworks), getString(R.string.event_fireworks_time),getString(R.string.art_dye_park), getString(R.string.art_dye_park_address), getString(R.string.event_fireworks_details)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
